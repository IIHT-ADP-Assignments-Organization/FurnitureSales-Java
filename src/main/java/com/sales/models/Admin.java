package com.sales.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	   @Column(name="adminId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	int adminid;
	
	@Column(name="adminName")
	String adminName;
	
	@Column(name="userName")
	String userName;
	
	@Column(name="password")
	String password;
public int getAdminid() {
	return adminid;
}
public void setAdminid(int adminid) {
	this.adminid = adminid;
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
