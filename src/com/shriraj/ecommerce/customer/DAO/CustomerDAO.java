package com.shriraj.ecommerce.customer.DAO;

import java.util.ArrayList;
import java.util.List;

import com.shriraj.ecommerce.customer.model.Customer;

public interface CustomerDAO {
	 List<Customer> getAllCustomers();
		
	 List<String> getAllCustomersEmailId();
		
	 Customer getCustomerByEmailId(String emailId); 
		
	 void addCustomer(Customer customerToBeAdded); 
}