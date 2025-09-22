package com.shriraj.ecommerce.user.Service;

import com.shriraj.ecommerce.user.Exception.UserAlreadyExistException;
import com.shriraj.ecommerce.user.Exception.UserNotExistException;
import com.shriraj.ecommerce.user.Model.User;

public interface UserService {
	 void register(String email, String password) throws UserAlreadyExistException;
	
	 User login(String email, String password) throws UserNotExistException;
	
}
