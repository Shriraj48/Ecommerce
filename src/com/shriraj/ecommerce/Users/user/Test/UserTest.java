package com.shriraj.ecommerce.Users.user.Test;


import java.util.ArrayList;
import java.util.List;
import com.shriraj.ecommerce.Users.user.Service.UserService;
import com.shriraj.ecommerce.Users.user.Service.UserServiceImp;
import com.shriraj.ecommerce.Users.user.DAO.InMemoryUserDAO;
import com.shriraj.ecommerce.Users.user.Model.User;
import com.shriraj.ecommerce.Users.customer.DAO.InMemoeryCustomerDAO;
import com.shriraj.ecommerce.Users.customer.model.Customer;
import com.shriraj.ecommerce.Users.customer.service.*;
import com.shriraj.ecommerce.Users.user.DAO.*;
import com.shriraj.ecommerce.Users.customer.DAO.*;

public class UserTest {

	public static void main(String[] args) {
	
		    List<User> db = new ArrayList<>();
		    UserDAO userDAO = new InMemoryUserDAO(db);
		    CustomerDAO customerDAO = new InMemoeryCustomerDAO(db);
		    CustomerService customer = new CustomerServiceImp(userDAO, customerDAO);
		
	try{
		customer.register("shriraj@", "password", "shopkeeper");
	} catch(Exception e) {
		System.out.println("Registration failed :" + e.getMessage());
		}
	
	try{
		customer.register("shriraj@", "password","customer");
	} catch(Exception e) {
		System.out.println("Registration failed :" + e.getMessage());
		}
		
	try{
		customer.register("shamika@", "p","customer");
	} catch(Exception e) {
		System.out.println("Registration failed :" + e.getMessage());
		}
	
	try {
		System.out.println(customer.login("shriraj@", "password"));
	}catch(Exception e) {
		System.out.println("Logib failed:"+ e.getMessage());
		}
	
	try {
		System.out.println(customer.login("shamika@", "p"));
	}catch(Exception e) {
			System.out.println("Logib failed:"+ e.getMessage());
		}
	
	try {
		System.out.println(customer.login("shrira", "password"));
	}catch(Exception e) {
			System.out.println("Logib failed:"+ e.getMessage());
		}
	
	try{
		customer.updateCredit(1, 1000.0);
	}catch(Exception e) {
		System.out.println("ID:"+ e.getMessage());
	}
	
	try {
	customer.forgotPassword("shriraj@", "c");
	}catch(Exception e) {
		System.out.println("ID:"+ e.getMessage());
	} 
	
	try {
		customer.changeAddress(1, "fjnrffijsejfrijri");
	}catch(Exception e) {
		System.out.println("ID:"+ e.getMessage());
	}
	
	try {
		System.out.println(customer.checkProfile(1));
	}catch(Exception e) {
		System.out.println("ID:"+ e.getMessage());
	}
	
	}
}