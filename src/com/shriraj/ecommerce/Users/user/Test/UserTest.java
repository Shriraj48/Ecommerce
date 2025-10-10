package com.shriraj.ecommerce.Users.user.Test;


import java.util.ArrayList;
import java.util.List;
import com.shriraj.ecommerce.Users.user.DAO.InMemoryUserDAO;
import com.shriraj.ecommerce.Users.user.Exception.SelectTheCorrectUser;
import com.shriraj.ecommerce.Users.user.Exception.UserAlreadyExistException;
import com.shriraj.ecommerce.Users.user.Model.User;
import com.shriraj.ecommerce.Users.customer.DAO.InMemoeryCustomerDAO;
import com.shriraj.ecommerce.Users.customer.service.*;
import com.shriraj.ecommerce.Users.user.DAO.*;
import com.shriraj.ecommerce.Users.customer.DAO.*;
import com.shriraj.ecommerce.Users.Admin.DAO.*;
import com.shriraj.ecommerce.Users.Admin.Model.Admin;
import com.shriraj.ecommerce.Users.Shopkeeper.DAO.*;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.Shopkeeper;
import com.shriraj.ecommerce.Users.Shopkeeper.Service.*;
import com.shriraj.ecommerce.Users.Admin.Service.*;
import com.shriraj.ecommerce.Users.Admin.observer.Observer;
import com.shriraj.ecommerce.Users.Shopkeeper.registersystemforshopkeeper.*;

public class UserTest {

	public static void main(String[] args) {
     
		 List<User> db = new ArrayList<>();
		    List<Shopkeeper> pendingRequests = new ArrayList<>();
		    List<Observer> observers = new ArrayList<>();

		    // DAOs
		    UserDAO userDAO = new InMemoryUserDAO(db);
		    RegisterSystemImplementation register = new RegisterSystemImplementation(observers, pendingRequests, userDAO);
		    CustomerDAO customerDAO = new InMemoeryCustomerDAO(db);
		    ShopkeeperDAO shopkeeperDAO = new InMemoryShopkeeperDAO(db, register);
		    AdminDAO adminDAO = new InMemoryAdminDAO(db, register,pendingRequests);

		    // Services
		    CustomerService customer = new CustomerServiceImp(userDAO, customerDAO);
		    ShopkeeperService shopkeeper = new ShopKeeperServiceImp(userDAO, shopkeeperDAO);
		    AdminService admin = new AdminServiceImp(userDAO, adminDAO,register);

// 			 Register users 
		    try {
	            admin.register("Raju@", "r", "admin");
	        } catch(Exception e) {
	            System.out.println("Registration failed: " + e.getMessage());
	        }
		    
		    try {
	            admin.register("Raja@", "rd", "admin");
	        } catch(Exception e) {
	            System.out.println("Registration failed: " + e.getMessage());
	        }
		    
//			Customer Tests 
		    try {
	            customer.register("shriraj@", "password", "customer");
	        } catch(Exception e) {
	            System.out.println("Registration failed: " + e.getMessage());
	        }

	        try {
	            customer.register("shamika@", "p", "customer");
	        } catch(Exception e) {
	            System.out.println("Registration failed: " + e.getMessage());
	        }
	        
	        try {
	            System.out.println(customer.login("shriraj@", "password"));
	        } catch(Exception e) {
	            System.out.println("Login failed: " + e.getMessage());
	        }

	        try {
	            System.out.println(customer.login("shamika@", "p"));
	        } catch(Exception e) {
	            System.out.println("Login failed: " + e.getMessage());
	        }
	        
	        try {
	            customer.updateCredit(2, 1000.0);
	        } catch(Exception e) {
	            System.out.println("Update Credit failed: " + e.getMessage());
	        }

	        try {
	            customer.forgotPassword("shriraj@", "c");
	        } catch(Exception e) {
	            System.out.println("Forgot Password failed: " + e.getMessage());
	        } 

	        try {
	            customer.changeAddress("shriraj@", "fjnrffijsejfrijri");
	        } catch(Exception e) {
	            System.out.println("Change Address failed: " + e.getMessage());
	        }

	        try {
	            System.out.println(customer.checkProfile(2));
	        } catch(Exception e) {
	            System.out.println("Check Profile failed: " + e.getMessage());
	        }
	
		  
		    Admin adminEntity = (Admin) adminDAO.getUserByEmail("Raju@");
		    Admin adminEntity2 = (Admin) adminDAO.getUserByEmail("Raja@");

		    register.registerObserver(adminEntity);
		    register.registerObserver(adminEntity2); 

		    
//			Shopkeeper sends approval request
		 
		    System.out.println("\n--- Shopkeeper sends approval request ---");
		    shopkeeper.requestToAdmin(
		            "raj@", 
		            "assword", 
		            "Raj", 
		            "Rajshri", 
		            "ferfgfrgfrgg", 
		            111222222L
		    );
		    
		    System.out.println("\n--- Shopkeeper sends approval request ---");
		    shopkeeper.requestToAdmin(
		            "rajkhana@", 
		            "word", 
		            "khana", 
		            "shri", 
		            "dfgdhdhdfhd", 
		            11155555555L
		    );

		    
//		    System.out.println( admin.getAllPendingRequest());
		    
		        
//			Admin approves the request
		    System.out.println("\n--- Admin approves request ---");
		   try {
			   admin.approvedRequest(
		            "raj@", 
		            "assword", 
		            "Raj", 
		            "Rajshri", 
		            "ferfgfrgfrgg", 
		            111222222L);}
		   catch (Exception e){
			    System.out.println(e.getMessage());
		   }
		  
		    System.out.println("\n--- Admin reject request ---");

		   try {
		    admin.rejectRequest("rajkhana@", 
		            "assword", 
		            "Raj", 
		            "Rajshri", 
		            "ferfgfrgfrgg", 
		            111222222L);}
			   catch (Exception e){
				    System.out.println(e.getMessage());
			   }

// 				Verify login after approval
		    try {
		        System.out.println("\n--- Shopkeeper login after approval ---");
		        System.out.println(shopkeeper.login("raj@", "assword"));
		    } catch (Exception e) {
		        System.out.println("Login failed: " + e.getMessage());
		    }
		    
		    try {
		        System.out.println("\n--- Shopkeeper login after approval ---");
		        System.out.println(shopkeeper.login("rajkhana@", "assword"));
		    } catch (Exception e) {
		        System.out.println("Login failed: " + e.getMessage());
		    }
		    
		    shopkeeper.updateShopDetails("raj@", "Raj", "Rajshri", "fffffffffrgg", 11122234422l);
	        
// 				Admin Tests 
		    
		    
		    	        admin.deleteUserById(8);  
		    	        System.out.println("User deleted successfully");
		    
		    	        System.out.println("All Users: " + admin.getCustomerByEmail("shriraj@") + admin.getShopkeeperbyEmail("raj@"));
		    
		    	       
		    	        // ---------------- Shopkeeper Tests (no exceptions yet) ----------------
		    
		    	        System.out.println(admin.getCustomerByEmail("shriraj@"));
		    	        System.out.println(admin.getShopkeeperbyEmail("raj@"));
	       
	        
	     
	}
}