package com.shriraj.ecommerce.customer.test;
import java.util.*;

import com.shriraj.ecommerce.customer.DAO.CustomerDAO;
import com.shriraj.ecommerce.customer.DAO.DAOApplication;
import com.shriraj.ecommerce.customer.DAO.ListCustomerDAO;
import com.shriraj.ecommerce.customer.DAO.RideInjector;
import com.shriraj.ecommerce.customer.model.Customer;
import com.shriraj.ecommerce.customer.service.CustomerService;

public class CustomerTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter EmailId:");
		String email = sc.nextLine();
		System.out.print("Enter Password:");
		String password = sc.nextLine();
		
		
		System.out.print("Enter EmailId:");
		String email2 = sc.nextLine();
		System.out.print("Enter Password:");
		String password2 = sc.nextLine();
		
		CustomerDAO h1 = new ListCustomerDAO();
		CustomerService cs = new CustomerService(h1); // hardcoding  dependency injection
		
		cs.registerCustomer(email, password, 100000);
		cs.registerCustomer(email2, password2, 100000);
		
		System.out.print("Enter EmailId:");
		String email3 = sc.nextLine();
		System.out.print("Enter Password:");
		String password3 = sc.nextLine();
//		System.out.println(cs.loginCustomer(email3, password3));
		Customer log = cs.loginCustomer(email3, password3);
		if (log != null) {
		    System.out.println("Successfully login");
		    System.out.println(log);
		} else {
		    System.out.println("Login failed: Invalid email or password.");
		}

		
		
		
//		ListCustomerDAO h1 = new ListCustomerDAO();
//		DAOApplication app = RideInjector.createApplication();
	System.out.println("Customer Added successfully");
	System.out.println(h1.getAllCustomers());
	System.out.println(h1.getAllCustomersEmailId());
	System.out.println(h1.getCustomerByEmailId("shrirajdhuri30@gmail.com"));
	
}

	
}
