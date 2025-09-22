package com.shriraj.ecommerce.Users.user.Service;

import com.shriraj.ecommerce.Users.user.DAO.UserDAO;
import com.shriraj.ecommerce.Users.user.Exception.UserAlreadyExistException;
import com.shriraj.ecommerce.Users.user.Exception.UserNotExistException;
import com.shriraj.ecommerce.Users.user.Model.User;

public class UserServiceImp implements UserService {
	private UserDAO userdao;
	
	public UserServiceImp(UserDAO userdao) {
		this.userdao = userdao;
	}
	
	
	public void register(String email, String password) throws UserAlreadyExistException{
		User user = userdao.getUserByEmail(email);
		if(user != null) {
			throw new UserAlreadyExistException("Email Id Already Exist Used Different EmailID");
		}else {
		userdao.addUser(new User(email,password)); 
		}
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
