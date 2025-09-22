package com.shriraj.ecommerce.user.DAO;


import com.shriraj.ecommerce.user.Model.User;
import java.util.List;

public class InMemoryUserDAO implements UserDAO {
	private List<User> userList;
	

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
