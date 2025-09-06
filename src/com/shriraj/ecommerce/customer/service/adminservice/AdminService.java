package com.shriraj.ecommerce.customer.service;

import java.util.List;

import com.shriraj.ecommerce.customer.DAO.CustomerDAO;
import com.shriraj.ecommerce.customer.model.Customer;
import com.shriraj.ecommerce.product.DAO.ProductDAO;
import com.shriraj.ecommerce.product.model.ProductModel;

public class AdminService implements roleService,ProductDAO{
	
	private CustomerDAO customer; 
	private ProductDAO product;
	
	public AdminService(CustomerDAO customer) {   
		this.customer = customer;
	}
	
	public AdminService(ProductDAO product) {
		this.product = product;
	}
	
	List<ProductModel> productList = product.getAllAvailableProducts();
	
	List<Customer> customerList = customer.getAllCustomers();
	

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
	
	public void deleteUser(Customer customerToBeAdded) {
		customerList.remove(customerToBeAdded);
	}
	
	@Override
	public void addProduct(ProductModel productAdded) {
		productList.add(productAdded);
	}
	
	@Override
	public ProductModel getProductByNumber(int productNumber){
		for (ProductModel p : productList) {
			if(p.getProductNumber()==(productNumber)) {
				return p;
			}
		}
		return null;
	}
	
	@Override
	public void deleteProduct(int productNumber) {
	    for (int i = 0; i < productList.size(); i++) {
	        if (productList.get(i).getProductNumber() == productNumber) {
	            productList.remove(i); 
	            break; 
	        }
	    }
	}

			
	@Override
	public Integer isProductInStock(int productNumber) {
		for (ProductModel p : productList) {
			if(p.getProductNumber()==(productNumber)) {
				return p.getProductStock();
			}
		}
		return null;
	}
	
	@Override
	public Integer updateProductInStock(int productNumber, int productStock) {
		for (ProductModel p : productList) {
			if(p.getProductNumber()==(productNumber)) {
				p.setProductStock(productStock);
				return p.getProductStock();
			}
		}
		return null;
	}
	
	@Override
	public List<ProductModel> getAllAvailableProducts() {
		return productList;
	}
	
	public List<Customer> getAllSeller(){
		return customer.getAllCustomers();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

