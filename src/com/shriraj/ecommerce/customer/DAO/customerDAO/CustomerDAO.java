package com.shriraj.ecommerce.customer.DAO.buyerDAO;

import java.util.List;

import com.shriraj.ecommerce.customer.model.buyermodel.Customer;
import com.shriraj.ecommerce.product.model.ProductModel;



public interface CustomerDAO {
		
	
	ProductModel addToCart();
	
	List<Double> viewCart();
		
	Customer placeOrder(String emailId); 
		
	double checkCredit(String emailID); 
	
	String changeAddress(String emailID,String address);
	
	Customer getCustomerProfile(String email);

	List<Customer> getAllCustomers();
	 	 		
}

