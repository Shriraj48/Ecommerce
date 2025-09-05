package com.shriraj.ecommerce.customer.test;
import java.util.*;
import com.shriraj.ecommerce.customer.DAO.InMemoryCustomerDAO;
import com.shriraj.ecommerce.customer.service.EmailIdAlreadyUsed;
import com.shriraj.ecommerce.customer.service.InvalidCredential;
import com.shriraj.ecommerce.customer.service.userService;

public class CustomerTest {
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter EmailId:");
		String email1 = sc.nextLine();
		System.out.print("Enter Password:");
		String password1 = sc.nextLine();
		
		System.out.print("Enter EmailId:");
		String email2 = sc.nextLine();
		System.out.print("Enter Password:");
		String password2 = sc.nextLine();
	
		System.out.print("Enter EmailId:");
		String email3 = sc.nextLine();
		System.out.print("Enter Password:");
		String password3 = sc.nextLine();
				
		
		
//		System.out.print("Enter EmailId:");
//		String email2 = sc.nextLine();
//		System.out.print("Enter Password:");
//		String password2 = sc.nextLine();
		
//		CustomerDAO h1 = new InMemoryCustomerDAO();
		userService cs = new userService( new InMemoryCustomerDAO()); // hardcoding  dependency injection
		try {
		cs.registerCustomer(email1, password1, 100000);
		cs.registerCustomer(email2, password2, 100000);
		cs.registerCustomer(email3, password3, 100000);
		} catch(EmailIdAlreadyUsed e) {
			System.out.println(e.getMessage());
		}
//		cs.registerCustomer(email2, password2, 100000);
		System.out.print("Enter Email:");
		String email = sc.nextLine();
		System.out.print("Enter Password:");
		String password = sc.nextLine();
		try {
		System.out.println(cs.loginCustomer(email, password));
		} catch(InvalidCredential e) {
			System.out.println(e.getMessage());
		}
//		Customer log = cs.loginCustomer(email3, password3);
//		if (log != null) {
//		    System.out.println("Successfully login");
//		    System.out.println(log);
//		} else {
//		    System.out.println("Login failed: Invalid email or password.");
//		}
//		System.out.print(cs.getAllCustomers());
}

	
}
