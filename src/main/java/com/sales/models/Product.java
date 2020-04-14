package com.sales.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	   @Column(name="userId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
		int userId;	
	
	@Column(name="productId")
      int productId;
	
	@Column(name="productName")
		String productName;
	
	@Column(name="productType")
		String productType;
	
	@Column(name="price")
		int price;
	
	@Column(name="picture")
		String picture;
	
	@Column(name="productUsedSpan")
		String productUsedSpan;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductType() {
	return productType;
}
public void setProductType(String productType) {
	this.productType = productType;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getPicture() {
	return picture;
}
public void setPicture(String picture) {
	this.picture = picture;
}
public String getProductUsedSpan() {
	return productUsedSpan;
}
public void setProductUsedSpan(String productUsedSpan) {
	this.productUsedSpan = productUsedSpan;
}

}
