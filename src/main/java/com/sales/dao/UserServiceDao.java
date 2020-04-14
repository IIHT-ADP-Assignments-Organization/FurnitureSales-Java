package com.sales.dao;

import java.util.List;

import com.sales.models.Order;
import com.sales.models.Payment;
import com.sales.models.Product;
import com.sales.models.User;

public interface UserServiceDao {
	
	User signUp(User user);
	boolean signIn(String email,String password);
	 Payment makePayment(Payment payment);
	  Order placeOrder(Order order);
	  boolean cancelOrder(Order order);
	  Order viewOrder(int OrderId);
	  List<Product> searchProduct(Product product);
	  int addProduct(Product product);
	  Product sellProduct(int productId,int companyId);
	  Product updateProduct(Product product);
	  boolean deleteProduct(int productId);
	  Product getProduct(int productId);
	  
}
