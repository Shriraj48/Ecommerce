package com.shriraj.ecommerce.Users.user.Service;

import com.shriraj.ecommerce.Users.Admin.Model.Admin;
import com.shriraj.ecommerce.Users.customer.model.Customer;
import com.shriraj.ecommerce.Users.user.DAO.UserDAO;
import com.shriraj.ecommerce.Users.user.Exception.SelectTheCorrectUser;
import com.shriraj.ecommerce.Users.user.Exception.UserAlreadyExistException;
import com.shriraj.ecommerce.Users.user.Exception.UserNotExistException;
import com.shriraj.ecommerce.Users.user.Model.User;

public class UserServiceImp implements UserService {
	private UserDAO userdao;
	
	public UserServiceImp(UserDAO userdao) {
		this.userdao = userdao;
	}
	
	
	public void register(String email, String password, String role) throws UserAlreadyExistException, SelectTheCorrectUser {
	    User user = userdao.getUserByEmail(email);
	    if (user != null) {
	        throw new UserAlreadyExistException("Email ID already exists. Please use a different email ID.");
	    }

	    User u;
	    if ("customer".equalsIgnoreCase(role)) {
	        u = new Customer(email, password, 0);
	    } else if ("admin".equalsIgnoreCase(role)) {
	        u = new Admin(email, password);
	    } else if ("user".equalsIgnoreCase(role)) {
	        u = new User(email, password);
	    } else  throw new SelectTheCorrectUser("Invalid role: " + role);

	  
	    userdao.addUser(u);
	}

	
	public User login(String email, String password) throws UserNotExistException{
		User user = userdao.getUserByEmail(email);
		if( user != null){
			return user;
		}else {
			throw new UserNotExistException("User not exist");
		}
	}
}
