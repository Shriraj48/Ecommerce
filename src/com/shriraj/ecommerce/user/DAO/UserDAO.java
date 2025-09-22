package com.shriraj.ecommerce.customer.DAO.userDAO;

import com.shriraj.ecommerce.customer.model.user.User;

public interface UserDAO {

	boolean addUser(User user);	
	
	 User getUserByEmail(String email);
	
	void logout();
}

