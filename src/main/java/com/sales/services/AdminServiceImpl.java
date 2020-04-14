package com.sales.services;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sales.models.Admin;
import com.sales.models.Company;
@Component
public class AdminServiceImpl implements AdminService {
	@Transactional
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
