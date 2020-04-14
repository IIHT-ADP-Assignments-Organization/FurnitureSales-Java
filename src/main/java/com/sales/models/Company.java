package com.sales.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company {
	
	@Id
	   @Column(name="companyId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
		int companyId;
	
	 @Column(name="adminId")
		int adminId;
	 
	 @Column(name="companyName")
		String companyName;
	 
	 @Column(name="phoneNumber")
		int phoneNumber;
	 
	 @Column(name="adddress")
		String adddress;
	 
public int getCompanyId() {
	return companyId;
}
public void setCompanyId(int companyId) {
	this.companyId = companyId;
}
public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getAdddress() {
	return adddress;
}
public void setAdddress(String adddress) {
	this.adddress = adddress;
}

}
