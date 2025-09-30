package com.shriraj.ecommerce.Users.user.DAO;

import java.util.List;

import com.shriraj.ecommerce.Users.customer.model.Customer;
import com.shriraj.ecommerce.Users.user.Model.User;

public interface UserDAO {

	 List<User> getAllUsers();
	 
	void addUser(User user);	
	
	 User getUserByEmail(String email);
	
}

