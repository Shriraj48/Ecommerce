package com.shriraj.ecommerce.customer.DAO.adminDAO;

import java.util.List;

import com.shriraj.ecommerce.customer.model.adminmodel.AdminModel;

public interface AdminDAO {
	 List<AdminModel> getAllAdmins();
		
	 List<String> getAllAdminsEmailId();
		
	 AdminModel getAdminsByEmailId(String emailId); 
		
	 void addAdmin(AdminModel customerToBeAdded); 
		
	 void deleteAdmin(AdminModel customerToBeAdded);
}
