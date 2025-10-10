package com.shriraj.ecommerce.Users.customer.service;

import com.shriraj.ecommerce.Users.customer.Exception.InvalidIdException;
import com.shriraj.ecommerce.Users.customer.model.Customer;
import com.shriraj.ecommerce.Users.user.Model.User;
import com.shriraj.ecommerce.Users.user.Service.UserService;

public interface CustomerService extends UserService {
	
	public Customer checkProfile(int id) throws InvalidIdException;

	void updateCredit(int id,  double credit) throws InvalidIdException;

	void forgotPassword(String email, String password) throws InvalidIdException;	
	
	public void changeAddress(String email, String address) throws InvalidIdException;
}
