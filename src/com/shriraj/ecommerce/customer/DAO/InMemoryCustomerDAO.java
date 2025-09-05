package com.shriraj.ecommerce.customer.DAO;
import java.util.ArrayList;
import java.util.List;
import com.shriraj.ecommerce.customer.model.Customer;



public class InMemoryCustomerDAO implements CustomerDAO{
	
	private List<Customer> customerList;
	
//	public InMemoryCustomerDAO(List<Customer> customerList) {
//		this.customerList = customerList;
//	}
	
	public InMemoryCustomerDAO() {
		this.customerList = new ArrayList<>();
	}

	
//private static List<Customer> customerList = new ArrayList<>(); 
	
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
	
	public void deleteCustomer(Customer customerToBeAdded) {
		customerList.remove(customerToBeAdded);
	}
}

