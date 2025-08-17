package com.shriraj.ecommerce.customer.service;
import java.util.List;
import com.shriraj.ecommerce.customer.model.Customer;
import com.shriraj.ecommerce.customer.DAO.*;


public class CustomerService {
   //private List<Customer> c = new ArrayList<>(); not to do this bcz we have to stored this in storage layer
	CustomerDAO dao = new CustomerDAO();
	List<Customer> customerList = dao.getAllCustomers();
	
	
	//Register
	public void registerCustomer(String customerEmail, String customerPassword) {
		dao.addCustomer(new Customer(customerEmail, customerPassword, 1000000));
		}
	
	
	//login
	public Customer loginCustomer(String customerEmail, String customerPassword) {
		for(Customer c : customerList) {

		if (c.getEmail().equals(customerEmail) && c.getPassword().equals(customerPassword)) {
			return c;
			}
		}
		return null;   
	}
	

} 
//Enter EmailId:shrirajdhuri30@gmail.com
//Enter Password:SND302002
//Enter EmailId:shamikadhuri17@gmail.com
//Enter Password:SND172010
//Enter EmailId:shrirajdhuri30@gmail.com

