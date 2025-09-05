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
	
//	List<Customer> customerList = customer.getAllCustomers();
	
	@Override
	public void registerCustomer(String customerEmail, String customerPassword, double customerCredit) throws EmailIdAlreadyUsed{    
		List<Customer> customerList = customer.getAllCustomers();
		for(Customer c : customerList) {
			if(c.getEmail().equals(customerEmail)) {
				throw new EmailIdAlreadyUsed("EmailID Already used"+customerEmail);
				 }
			}
		customer.addCustomer(new Customer(customerEmail, customerPassword, customerCredit));
		}
	
	
	
	@Override
	public Customer loginCustomer(String customerEmail, String customerPassword) throws InvalidCredential{
		List<Customer> customerList = customer.getAllCustomers();
		for(Customer c : customerList) {
			if(c.getEmail()==(customerEmail) && c.getPassword()==(customerPassword)){
			return c;
			}
		}
		throw new InvalidCredential("Invalid Password or EmailID");   
	}
	
	public List<Customer> getAllCustomers(){
		return customer.getAllCustomers();
	}
} 


