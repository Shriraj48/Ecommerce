package com.shriraj.ecommerce.customer.DAO.buyerDAO;

import java.util.List;

import com.shriraj.ecommerce.customer.DAO.admin.adminDAO.AdminDAO;
import com.shriraj.ecommerce.customer.DAO.sellerDAO.ShopkeeperDAO;
import com.shriraj.ecommerce.customer.DAOuserDAO.InMemoryUserDAO;
import com.shriraj.ecommerce.customer.model.buyermodel.Customer;
import com.shriraj.ecommerce.product.DAO.ProductDAO;
import com.shriraj.ecommerce.product.model.ProductModel;

public class InMemoryCustomerDAO extends InMemoryUserDAO implements CustomerDAO {
	private List<Customer> customerList;
	private ProductDAO product;
	
	public InMemoryCustomerDAO(){
		
	}
	
	public InMemoryCustomerDAO(CustomerDAO customer, ShopkeeperDAO shopkeeper, AdminDAO admin,List<Customer> customerList, ProductDAO product) {
		super(customer, shopkeeper, admin);
		this.customerList = customerList;
		this.product = product;
	}

	List<ProductModel> productList = product.getAllAvailableProducts();
	
	@Override
	public ProductModel addToCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer placeOrder(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double checkCredit(String emailID) {
		for(Customer c : customerList) {
			if(c.getEmail()==(emailID)) {
				for(ProductModel p : productList) {
				return c.setCredit(c.getCredit()-p.getProductPrice());
			}
		}
	}
		return 1.0;
}

	@Override
	public String changeAddress(String emailID, String address) {
		for(Customer c : customerList) {
			if(c.getEmail()==(emailID)) {
				 c.setAddress(address);
				 return address;
			}
		}
		return null ;
	}

	@Override
	public Customer getCustomerProfile(String emailID) {
		for(Customer c : customerList) {
			if(c.getEmail()==(emailID)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public List<Double> viewCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerList;
	}
	
}
