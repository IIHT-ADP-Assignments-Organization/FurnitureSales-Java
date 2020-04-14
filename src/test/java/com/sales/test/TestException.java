package com.sales.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sales.common.InvalidCredentials;
import com.sales.common.UserAlreadyExistException;
import com.sales.common.UserDoesNotExistException;
import com.sales.models.Admin;
import com.sales.models.User;
import com.sales.services.AdminService;
import com.sales.services.UserService;

import junit.framework.Assert;

public class TestException {
	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	
        User user=new User();
        user.setEmail("james@gmail.com");
        user.setPassword("hello123");
     Admin admin =new Admin();
     admin.setAdminid(12);
     admin.setPassword("hello@123");
     admin.setUserName("example");
    
	 
	 UserService userservice = (UserService) context.getBean("UserService");
	 userservice.signUp(user);
	 
	 AdminService adminservice = (AdminService) context.getBean("AdminService");
	 adminservice.signUp(admin);
	 
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	
	@Test
    public void testForUserLogin() throws UserDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	 User user=new User();
     user.setEmail("james@gmail.com");
     user.setPassword("hello123");
  Admin admin =new Admin();
  admin.setAdminid(12);
  admin.setPassword("hello@123");
  admin.setUserName("example");
 
     
	     UserService userservice = (UserService) context.getBean("UserService");
	     userservice.signIn(user.getEmail(),user.getPassword());
     
     AdminService adminservice = (AdminService) context.getBean("AdminService");
     adminservice.signIn(admin.getUserName(),admin.getPassword()) ;
Assert.assertEquals(UserDoesNotExistException.message," user does not exists !..please register");
     }
	
	@Test
    public void testForvalidpassword() throws InvalidCredentials  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	 User user=new User();
     user.setEmail("james@gmail.com");
     user.setPassword("hello123");
     UserService userservice = (UserService) context.getBean("UserService");
     userservice.signIn(user.getEmail(),user.getPassword());
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
	@Test
    public void testForvalidname() throws InvalidCredentials  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	 Admin admin=new Admin();
	 
	 admin.setAdminid(12);
     admin.setPassword("hello@123");
     admin.setUserName("example");
     AdminService adminservice = (AdminService) context.getBean("AdminService");
     adminservice.signIn(admin.getUserName(),admin.getPassword());
     
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
}
