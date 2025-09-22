package com.shriraj.ecommerce.user.DAO;

import java.util.List;

import com.shriraj.ecommerce.user.Model.User;

public interface UserDAO {

	 List<User> getAllUsers();
	 
	void addUser(User user);	
	
	 User getUserByEmail(String email);
	
}

