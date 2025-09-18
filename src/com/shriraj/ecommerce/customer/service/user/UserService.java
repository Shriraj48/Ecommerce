package com.shriraj.ecommerce.customer.service.user;

import com.shriraj.ecommerce.customer.DAO.userDAO.UserDAO;
import com.shriraj.ecommerce.customer.model.customer.Customer;
import com.shriraj.ecommerce.customer.model.shopkeeper.Shopkeeper;
import com.shriraj.ecommerce.customer.model.user.User;

public class UserService {
	private UserDAO userdao;
	private User user;
	
	public UserService(UserDAO userdao,User users) {
		this.userdao = userdao;
		this.user = users;
	}
	
	
	
	public void register(String email, String password,String shopName,String address, double credit) {
		if (shopName == null) {
			userdao.addUser(new Customer(email,password,address,credit)); 
		}else {
			userdao.addUser(new Shopkeeper(email,password,shopName));
		}	
	}
	
	public User login(String email, String password) {
		User user = userdao.getUserByEmail(email);
		if( user != null && user.getPassword().equals(password)){
			return user;
		}
		return null;
	}
}
