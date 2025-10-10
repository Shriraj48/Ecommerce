package com.shriraj.ecommerce.Users.user.DAO;

import java.util.List;

import com.shriraj.ecommerce.Users.Shopkeeper.Model.ShopDetails;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.Shopkeeper;
import com.shriraj.ecommerce.Users.user.Model.User;

public interface UserDAO {

	 List<User> getAllUsers();
	 
	 void addUser(User user);	
	
	 User getUserByEmail(String email);
	 
	 User findById(int id);
	}

