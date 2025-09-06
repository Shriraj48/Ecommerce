package com.shriraj.ecommerce.order.service;
import java.util.List;

import com.shriraj.ecommerce.customer.DAO.adminDAO.CustomerDAO;
import com.shriraj.ecommerce.customer.model.buyermodel.Customer;
import com.shriraj.ecommerce.product.DAO.*;
import com.shriraj.ecommerce.product.model.*;

public class OrderService {

	ProductModel pm = new ProductModel();
	Customer c1 = new Customer();
	CustomerDAO cd1 = new CustomerDAO();
	List<Customer> customerList = cd1.getAllCustomers();
	
	ProductDAO pd1 = new ProductDAO();
	List<ProductModel> productList = pd1.getAllAvailableProducts();
	
	
	
//	placeOrder
	public void placeOrder(String emailId, int productNumber, int productStock) {
	    for (Customer c : customerList) {
	        if (c.getEmail().equals(emailId)) {
	            for (ProductModel p : productList) {
	                if (p.getProductNumber() == (productNumber)) {
	                    c.setCredit(c.getCredit() - p.getProductPrice());
	                    for (ProductModel p1 : productList) {
	                    	p1.setProductStock(p1.getProductStock() - productStock);
	                    }
	                }
	            }
	        }
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
