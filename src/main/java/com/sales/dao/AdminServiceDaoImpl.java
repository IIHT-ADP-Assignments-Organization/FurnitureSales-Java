package com.sales.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sales.models.Admin;
import com.sales.models.Company;
@Component
public class AdminServiceDaoImpl implements AdminServiceDao {
	@Autowired
	SessionFactory sessionfactory;
	public Admin signUp(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean signIn(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public int addCompany(Company company) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	public Company getCompany(int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteCompany(int companyId) {
		// TODO Auto-generated method stub
		return false;
	}

}
