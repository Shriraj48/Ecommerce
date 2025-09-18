package com.shriraj.ecommerce.customer.DAO.userDAO;


import java.util.ArrayList;

import com.shriraj.ecommerce.customer.model.customer.Customer;
import com.shriraj.ecommerce.customer.model.shopkeeper.Shopkeeper;
import com.shriraj.ecommerce.customer.model.user.User;
import com.shriraj.ecommerce.customer.service.user.UserService;

public class UserTest {

	public static void main(String[] args) {
	
//	UserDAO dao = new InMemoryUserDAO(new ArrayList<>(),new ArrayList<>());
	
	UserService u = new UserService(new InMemoryUserDAO(new ArrayList<>(),new ArrayList<>()),null);
	u.register("shriraj@", "password", null, "parvati", 1000.0);
	
	u.register("shamika@", "p", "Enterprise", null, 0.0);
	
	System.out.println(u.login("shriraj@", "password"));
	System.out.println(u.login("shamika@", "p"));
	}
}