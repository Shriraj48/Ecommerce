package com.shriraj.ecommerce.Users.user.DAO;


import com.shriraj.ecommerce.Users.Admin.Model.Admin;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.ShopDetails;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.Shopkeeper;
import com.shriraj.ecommerce.Users.customer.model.Customer;
import com.shriraj.ecommerce.Users.user.Model.User;
import java.util.List;

public class InMemoryUserDAO implements UserDAO {
	protected List<User> userList;


	public InMemoryUserDAO(List<User> userList) {
		this.userList = userList;

		}

		@Override
		public List<User> getAllUsers() {
	        return userList;
	    }
	  
		@Override
		public void addUser(User user) {
        userList.add(user);
		}
	
		@Override
		public User getUserByEmail(String email) {
			for(User u : userList) {
			if (u instanceof Customer) {    
		            Customer c = (Customer) u; 
			if(c.getEmail().equals(email)) {
					return c;
				}
			}else  if (u instanceof Shopkeeper) {    
	            Shopkeeper s = (Shopkeeper) u; 
	            if(s.getEmail().equals(email)) {
	            	return s;
	            		}
			}else if(u instanceof Admin) {    
				Admin a = (Admin) u; 
	            if(a.getEmail().equals(email)) {
	            	return a;
	            		}
			}
				}
					return null;
			}
	
	
	
		public User findById(int id) {
	    for (User u : userList) {           
	        if (u instanceof Customer) {    
	            Customer c = (Customer) u; 
	            if (c.getId() == id) {
	                return c;             
	            	}
	        } else if (u instanceof Shopkeeper) {    
	        	Shopkeeper s = (Shopkeeper) u; 
	            if (s.getId() == id) {
	                return s;             
	            	}
	        	}
	    	}
	    			return null; 
			}
	
		   
}


