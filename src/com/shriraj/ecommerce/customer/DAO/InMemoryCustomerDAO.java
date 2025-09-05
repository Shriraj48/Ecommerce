package com.shriraj.ecommerce.customer.DAO;
import java.util.ArrayList;
import java.util.List;
import com.shriraj.ecommerce.customer.model.Customer;



public class ListCustomerDAO implements CustomerDAO{
private static List<Customer> customerList = new ArrayList<>(); // make customerDAO interface and all method in that interface
	
	public List<Customer> getAllCustomers(){
		return customerList;
	}
	
	public List<String> getAllCustomersEmailId(){ 
		List<String> emailList = new ArrayList<>();
		for(Customer c : customerList) {
			emailList.add(c.getEmail());
		} 
		return emailList;
	}
	
	public Customer getCustomerByEmailId(String emailId) {
		for(Customer c : customerList) {
			if(c.getEmail().equals(emailId)) {
				return c;
			}	
		}
		return null;
	}
	
	public void addCustomer(Customer customerToBeAdded) {
		customerList.add(customerToBeAdded);
	}
}

