package com.shriraj.ecommerce.Users.user.Test;


import java.util.ArrayList;

import com.shriraj.ecommerce.Users.user.Service.UserService;
import com.shriraj.ecommerce.Users.user.Service.UserServiceImp;
import com.shriraj.ecommerce.Users.user.DAO.InMemoryUserDAO;

public class UserTest {

	public static void main(String[] args) {
	
//	UserDAO dao = new InMemoryUserDAO(new ArrayList<>());
	
	UserService u = new UserServiceImp(new InMemoryUserDAO(new ArrayList<>())); // singleton pattern , Observer pattern 
	
	UserService user = new UserServiceImp(new InMemoryUserDAO(new ArrayList<>()));
	try{
		u.register("shriraj@", "password");
	} catch(Exception e) {
		System.out.println("Registration failed :" + e.getMessage());
	}
	
	try{
		u.register("shriraj@", "password");
	} catch(Exception e) {
		System.out.println("Registration failed :" + e.getMessage());
	}
	
	try{
		u.register("shamika@", "p");
	} catch(Exception e) {
		System.out.println("Registration failed :" + e.getMessage());
	}
	
	try {
		System.out.println(u.login("shriraj@", "password"));
	}catch(Exception e) {
		System.out.println("Logib failed:"+ e.getMessage());
	}
	
	try {
		System.out.println(u.login("shamika@", "p"));
	}catch(Exception e) {
			System.out.println("Logib failed:"+ e.getMessage());
	}
	
	
	try {
		System.out.println(u.login("shrira", "password"));
	}catch(Exception e) {
			System.out.println("Logib failed:"+ e.getMessage());
	}
	
	}
}