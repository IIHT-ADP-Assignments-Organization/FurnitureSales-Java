package com.sales.test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;

import org.junit.Test;
import com.sales.models.Admin;
import com.sales.models.User;



public class TestBoundary {
	 @Test
	 public void validCustomerEmail()
	 {
		 User user=new User();
		 user.setEmail("james@gmail.com");
	     String emailRegex = "[a-zA-Z0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]+";
	     boolean check=Pattern.matches(emailRegex,user.getEmail());
	     assertEquals(true,check);
	 }
	 
	 @Test
	    public void validPhoneNumber()
	    {
		 User user=new User();
		 user.setEmail("james@gmail.com");
		 user.setPhoneNumber(1234567890);
		 
		  int phoneNumberLength=10;
	        
	        int getLengthOfNumber=(Integer.toString(user.getPhoneNumber()).length());
	        assertEquals( phoneNumberLength, getLengthOfNumber);
	
	    }
	 
	 @Test
	 public void validUserName()
	 {
		Admin admin=new Admin();
		admin.setUserName("marryjohn");
	     String userNameRegex =  "^[a-z0-9_-]{3,15}$";
	     boolean check=Pattern.matches(userNameRegex,admin.getUserName());
	     assertEquals(true,check);
	 }
	 
	 @Test
	 public void validUserNameLength()
	 {
		 Admin admin=new Admin();
			admin.setUserName("marryjohn");
	     int min=2;
	      boolean namelengthfromdb=admin.getUserName().length()>min;
	     assertEquals(true,namelengthfromdb);
	 }
	 
	 public void validPasswordLength()
	 {
		User user=new User();
		user.setPassword("hello1234");
		Admin admin=new Admin();
		admin.setPassword("hello1234");
	     int passwordLength=10;
	    boolean Length=user.getPassword().length()>=passwordLength;
	    boolean l1=admin.getPassword().length()>=passwordLength;
	     assertEquals(true,Length);
	     assertEquals(true,l1);
	 }
	

	 
}
