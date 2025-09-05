package com.shriraj.ecommerce.customer.service;
import java.util.List;
import com.shriraj.ecommerce.customer.model.Customer;
import com.shriraj.ecommerce.customer.DAO.*;


public class CustomerService {
   //private List<Customer> c = new ArrayList<>(); not to do this bcz we have to stored this in storage layer
//	ListCustomerDAO customerDAO = new ListCustomerDAO(); // hardcoding solution research
//	DAOApplication app = RideInjector.createApplication();
	private CustomerDAO customer;
	
	public CustomerService(CustomerDAO customer) {   // constructor dependency injection
		this.customer = customer;
	}
	
	
	//Register
	public void registerCustomer(String customerEmail, String customerPassword, double customerCredit) {   // add credit 
		customer.addCustomer(new Customer(customerEmail, customerPassword, customerCredit));  // customer exist logic
		}
	
	
	//login
	public Customer loginCustomer(String customerEmail, String customerPassword) {
		List<Customer> customerList = customer.getAllCustomers();
		for(Customer c : customerList) {
			if (c.getEmail()==(customerEmail) && c.getPassword()==(customerPassword)) {
				return c;
				}
		}
		return null;   
	}
	

} 


