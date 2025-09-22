package com.shriraj.ecommerce.user;


import java.util.ArrayList;

import com.shriraj.ecommerce.customer.service.user.UserService;
import com.shriraj.ecommerce.user.DAO.InMemoryUserDAO;

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