package com.sales.services;

import com.sales.models.Admin;
import com.sales.models.Company;

public interface AdminService {
	
Admin signUp(Admin admin);
boolean signIn(String userName,String password);
int addCompany(Company company);
Company updateCompany(Company company);
Company getCompany(int companyId);
boolean deleteCompany(int companyId);

}
