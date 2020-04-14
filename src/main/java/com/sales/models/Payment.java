package com.sales.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {
	@Id
	   @Column(name="paymentId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	int paymentId;
	
	@Column(name="paymentType")
	String paymentType;
	
	@Column(name="amount")
	int amount;
	
	@Column(name="userId")
	int userId;
	
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public String getPaymentType() {
	return paymentType;
}
public void setPaymentType(String paymentType) {
	this.paymentType = paymentType;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
}
