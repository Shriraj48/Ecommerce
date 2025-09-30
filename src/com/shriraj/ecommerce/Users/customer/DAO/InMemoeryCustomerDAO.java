package com.shriraj.ecommerce.Users.customer.DAO;

import java.util.List;
import com.shriraj.ecommerce.Users.customer.model.Customer;
import com.shriraj.ecommerce.Users.user.DAO.InMemoryUserDAO;
import com.shriraj.ecommerce.Users.user.Model.User;

public class InMemoeryCustomerDAO extends InMemoryUserDAO implements CustomerDAO {
	
	
	
	public InMemoeryCustomerDAO(List<User> userList) {
		super(userList);
		}
	
	@Override
	public Customer findById(int id) {
	    for (User u : userList) {           
	        if (u instanceof Customer) {    
	            Customer c = (Customer) u; 
	            if (c.getId() == id) {
	                return c;             
	            }
	        }
	    }
	    return null; 
	}

	@Override
	public void update(int id, double credit) {
	    for (User u : userList) {
	        if (u instanceof Customer) {
	            Customer c = (Customer) u;
	            if (c.getId() == id) {      
	                c.setCredit(c.getCredit() + credit);   
	            }
	        }
	    }
	}

	@Override
	public void changePasswordByEmailId(String email,String password) {
		for (User u : userList) {
			if(u instanceof Customer) {
				Customer c = (Customer) u;
				if(c.getEmail()==(email)) {
				c.setPassword(password);	
			   }	
			}
		}
	}

	public void addAddress(int id, String address) {
		for(User u : userList) {
			Customer c= (Customer) u;
			if(c.getId()==(id)) {
				c.setAddress(address);
			}
		}
	}

}
	
	
	
	
	
	
	
	
	
	
	

