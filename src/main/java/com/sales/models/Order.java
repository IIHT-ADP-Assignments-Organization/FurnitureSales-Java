package com.sales.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Order")
public class Order {
	@Id
	   @Column(name="orderId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	int orderId;
	
	@Column(name="orderDate")
	Date orderDate;
	
	@Column(name="orderStatus")
	String orderStatus;
	
	@Column(name="productId")
	int productId;
	
	@Column(name="userId")
	int userId;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public Date getOrderDate() {
	return orderDate;
}
public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}
public String getOrderStatus() {
	return orderStatus;
}
public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}

}
