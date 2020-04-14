package com.sales.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sales.models.Order;
import com.sales.models.Payment;
import com.sales.models.Product;
import com.sales.models.User;
@Component
public class UserServiceImpl implements UserService {
	@Transactional
	public User signUp(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean signIn(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public Payment makePayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	public Order placeOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean cancelOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	public Order viewOrder(int OrderId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> searchProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Product sellProduct(int productId, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
