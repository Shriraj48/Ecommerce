package com.shriraj.ecommerce.Users.customer.DAO;

import com.shriraj.ecommerce.Users.customer.model.Customer;
import com.shriraj.ecommerce.Users.user.DAO.UserDAO;
import com.shriraj.ecommerce.Users.user.Model.User;

public interface CustomerDAO extends UserDAO {
	
	Customer findById(int id);

	void update(int id,double credit);
	
	void changePasswordByEmailId(String email,String password);
	
	public void addAddress(int id, String address);
}
