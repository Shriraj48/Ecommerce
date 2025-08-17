package com.shriraj.ecommerce.customer.test;
import java.util.*;

import com.shriraj.ecommerce.customer.DAO.CustomerDAO;
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
		
		
		CustomerService cs = new CustomerService();
		CustomerService cs1 = new CustomerService();
		cs.registerCustomer(email, password);
		cs1.registerCustomer(email2, password2);
		
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

		
		
		
	CustomerDAO h1 = new CustomerDAO();
	System.out.println("Customer Added successfully");
	System.out.println(h1.getAllCustomers());
	System.out.println(h1.getAllCustomersEmailId());
	System.out.println(h1.getCustomerByEmailId("shrirajdhuri30@gmail.com"));
	
}

	
}
