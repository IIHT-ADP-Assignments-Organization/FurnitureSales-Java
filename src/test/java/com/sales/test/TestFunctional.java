package com.sales.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sales.models.Admin;
import com.sales.models.Company;
import com.sales.models.Order;
import com.sales.models.Payment;
import com.sales.models.Product;
import com.sales.models.User;
import com.sales.services.AdminService;
import com.sales.services.UserService;


public class TestFunctional {
	@Test
	public void testvalidAdminRegistration() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	 Admin admin=new Admin();
	 admin.setAdminid(3);
	 admin.setAdminName("james");
	 admin.setPassword("hello123");
	 admin.setUserName("jamesJohn");
String isRegistered=(admin.getUserName());

AdminService adminservice=(AdminService) context.getBean("AdminService");
Admin registration =adminservice.signUp(admin);
assertEquals(isRegistered,registration);
}
	
	@Test
	public void tesForValidAdminLogin() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	Admin admin=new Admin();
	 admin.setAdminid(3);
	 admin.setAdminName("james");
	 admin.setPassword("hello123");
	 admin.setUserName("jamesJohn");
	 AdminService adminservice=(AdminService) context.getBean("AdminService");
	boolean userdetailsfromdb=adminservice.signIn(admin.getUserName(),admin.getPassword());
	assertEquals(true,userdetailsfromdb);
}
	
	@Test
	public void tesForAddCompany() {
		Company company=new Company();
		company.setAdddress("banglore");
		company.setAdminId(123);
		company.setCompanyId(102);
		company.setCompanyName("philips");
		company.setPhoneNumber(1234567890);
		
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
			 AdminService adminservice=(AdminService) context.getBean("AdminService");
	int detailsfromdb=adminservice.addCompany(company);
	assertNotNull(detailsfromdb);
}
	
	@Test
	public void tesForUpdateCompany() {
		Company company=new Company();
		company.setAdddress("banglore");
		company.setAdminId(123);
		company.setCompanyId(102);
		company.setCompanyName("philips");
		company.setPhoneNumber(1234567890);
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
			 AdminService adminservice=(AdminService) context.getBean("AdminService");
	Company detailsfromdb=adminservice.updateCompany(company);
	assertNotNull(detailsfromdb);
}
	@Test
	public void tesForDeleteCompany() {
		
		Company company=new Company();
		company.setAdddress("banglore");
		company.setAdminId(123);
		company.setCompanyId(102);
		company.setCompanyName("philips");
		company.setPhoneNumber(1234567890);

			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
			 AdminService adminservice=(AdminService) context.getBean("AdminService");
	boolean detailsfromdb=adminservice.deleteCompany(company.getCompanyId());
	
	assertEquals(true,detailsfromdb);
}
	
	@Test
	public void testvalidUserRegistration() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	 User user=new User();
	 user.setAddress("manglore");
	 user.setEmail("james@gmail.com");
	 user.setPassword("hello1234");
	 user.setPhoneNumber(1234567890);
	 user.setUserId(5);
	 user.setUserName("john");
	 
String isRegistered=(user.getEmail());

UserService userservice=(UserService) context.getBean("UserService");
User registration =userservice.signUp(user);
assertEquals(isRegistered,registration);
}
	
	@Test
	public void tesForValidUserLogin() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	 User user=new User();
	 user.setAddress("manglore");
	 user.setEmail("james@gmail.com");
	 user.setPassword("hello1234");
	 user.setPhoneNumber(1234567890);
	 user.setUserId(5);
	 user.setUserName("john");
	 UserService userservice=(UserService) context.getBean("UserService");
	boolean userdetailsfromdb=userservice.signIn(user.getEmail(),user.getPassword());
	assertEquals(true,userdetailsfromdb);
}
	
	@Test
	public void TestForPayment() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	Payment payment=new Payment();
	payment.setAmount(2000);
	payment.setPaymentId(12);
	payment.setPaymentType("cash");
	payment.setUserId(1);
	UserService userservice=(UserService) context.getBean("UserService");
	Payment detailsfromdb=userservice.makePayment(payment);
	assertNotNull(detailsfromdb);
	}	
	
	@Test
	public void TestForPlaceOrder() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	Order order=new Order();
	order.setOrderId(4);
	order.setOrderStatus("will be delivered shortly");
	order.setProductId(1);
	order.setUserId(3);
	UserService userservice=(UserService) context.getBean("UserService");
	Order detailsfromdb=userservice.placeOrder(order);
	assertNotNull(detailsfromdb);
	}	

	@Test
	public void TestForCancelOrder() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	Order order=new Order();
	order.setOrderId(4);
	order.setOrderStatus("will be delivered shortly");
	order.setProductId(1);
	order.setUserId(3);
	UserService userservice=(UserService) context.getBean("UserService");
	boolean detailsfromdb=userservice.cancelOrder(order);
	assertNotNull(detailsfromdb);
	}	
	
	@Test
	public void TestForViewOrder() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	Order order=new Order();
	order.setOrderId(4);
	order.setOrderStatus("will be delivered shortly");
	order.setProductId(1);
	order.setUserId(3);
	UserService userservice=(UserService) context.getBean("UserService");
	Order detailsfromdb=userservice.viewOrder(order.getOrderId());
	assertNotNull(detailsfromdb);
	}	
	
	@Test
	public void TestForSearchproduct() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
	Product product=new Product();
	product.setPicture("user/desktop/pics");
	product.setPrice(2000);
	product.setProductId(13);
	product.setProductName("dining table");
	product.setProductType("wood");
	product.setProductUsedSpan("two months");
	product.setUserId(13);
	
	UserService userservice=(UserService) context.getBean("UserService");
	List<Product> detailsfromdb=userservice.searchProduct(product);
	assertNotNull(detailsfromdb);
	}	
	
	@Test
	public void tesForAddProduct() {
		Product product=new Product();
		product.setPicture("user/desktop/pics");
		product.setPrice(2000);
		product.setProductId(13);
		product.setProductName("dining table");
		product.setProductType("wood");
		product.setProductUsedSpan("two months");
		product.setUserId(13);
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
			 UserService userservice=(UserService) context.getBean("UserService");
	int detailsfromdb=userservice.addProduct(product);
	assertNotNull(detailsfromdb);
}
	
	@Test
	public void tesForUpdateProduct() {
		Product product=new Product();
		product.setPicture("user/desktop/pics");
		product.setPrice(2000);
		product.setProductId(13);
		product.setProductName("dining table");
		product.setProductType("wood");
		product.setProductUsedSpan("two months");
		product.setUserId(13);
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
			 UserService userservice=(UserService) context.getBean("UserService");
	Product detailsfromdb=userservice.updateProduct(product);
	assertNotNull(detailsfromdb);
}
	@Test
	public void tesForDeleteProduct() {
		
		Product product=new Product();
		product.setPicture("user/desktop/pics");
		product.setPrice(2000);
		product.setProductId(13);
		product.setProductName("dining table");
		product.setProductType("wood");
		product.setProductUsedSpan("two months");
		product.setUserId(13);
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
			 UserService userservice=(UserService) context.getBean("UserService");
	boolean detailsfromdb=userservice.deleteProduct(product.getProductId());
	assertNotNull(detailsfromdb);
}
	@Test
	public void tesForSellProduct() {
		
		Product product=new Product();
		product.setPicture("user/desktop/pics");
		product.setPrice(2000);
		product.setProductId(13);
		product.setProductName("dining table");
		product.setProductType("wood");
		product.setProductUsedSpan("two months");
		product.setUserId(13);
		
		Company company=new Company();
		company.setAdddress("banglore");
		company.setAdminId(123);
		company.setCompanyId(102);
		company.setCompanyName("philips");
		company.setPhoneNumber(1234567890);

	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("food-application.xml");
			 UserService userservice=(UserService) context.getBean("UserService");
	Product detailsfromdb=userservice.sellProduct(product.getProductId(), company.getCompanyId());
	assertNotNull(detailsfromdb);
}
	


}
