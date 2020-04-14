package com.sales.dao;

import java.util.List;

import com.sales.models.Admin;
import com.sales.models.Company;
import com.sales.models.Order;
import com.sales.models.Payment;
import com.sales.models.Product;
import com.sales.models.User;

public interface AdminServiceDao {
	
	Admin signUp(Admin admin);
	boolean signIn(String userName,String password);
	int addCompany(Company company);
	Company updateCompany(Company company);
	Company getCompany(int companyId);
	boolean deleteCompany(int companyId);

}
