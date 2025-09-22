package com.shriraj.ecommerce.Users.user.Service;

import com.shriraj.ecommerce.Users.user.Exception.UserAlreadyExistException;
import com.shriraj.ecommerce.Users.user.Exception.UserNotExistException;
import com.shriraj.ecommerce.Users.user.Model.User;

public interface UserService {
	 void register(String email, String password) throws UserAlreadyExistException;
	
	 User login(String email, String password) throws UserNotExistException;
	
}
