package com.shriraj.ecommerce.Users.user.DAO;


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
		for(User c : userList) {
			if(c.getEmail().equals(email)) {
				return c;
			} 
		}
		return null;
	}
	
	
	}


