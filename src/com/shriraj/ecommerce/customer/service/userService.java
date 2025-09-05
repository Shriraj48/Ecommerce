package com.shriraj.ecommerce.customer.service;
import java.util.List;
import com.shriraj.ecommerce.customer.model.Customer;
import com.shriraj.ecommerce.customer.DAO.*;


public class userService implements roleService{
//	private InMemoryCustomerDAO customer; //only valid for inmemorycustomer object 
	private CustomerDAO customer; // hence making top base class object which valid for all dao operation
	
	public userService(CustomerDAO customer) {   // constructor dependency injection
		this.customer = customer;
	}
	
	@Override
	public void registerCustomer(String customerEmail, String customerPassword, double customerCredit) {    
		customer.addCustomer(new Customer(customerEmail, customerPassword, customerCredit));  // customer exist logic
		}
	
	
	@Override
	public Customer loginCustomer(String customerEmail, String customerPassword) {
		List<Customer> customerList = customer.getAllCustomers();
		for(Customer c : customerList) {
			if (c.getEmail()==(customerEmail) && c.getPassword()==(customerPassword)) {
				return c;
				}
		}
		return null;   
	}
	
	public List<Customer> getAllCustomers(){
		return customer.getAllCustomers();
	}


	
} 


