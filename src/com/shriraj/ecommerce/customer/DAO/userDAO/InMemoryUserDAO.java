package com.shriraj.ecommerce.customer.DAO.userDAO;

import com.shriraj.ecommerce.customer.model.customer.Customer;
import com.shriraj.ecommerce.customer.model.shopkeeper.Shopkeeper;
import com.shriraj.ecommerce.customer.model.user.User;
import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDAO implements UserDAO {
	private List<Customer> customerList;
	private List<Shopkeeper> shopkeeperList;

	public InMemoryUserDAO(List<Customer> customerList,List<Shopkeeper> shopkeeperList) {
		this.customerList = customerList;
		this.shopkeeperList = shopkeeperList;

	}
	
	@Override
	public boolean addUser(User user) {
		if(user instanceof Customer) {
			Customer customerToBeAdded = (Customer)user;
			customerList.add(customerToBeAdded);
		}else { 
			Shopkeeper shopkeeperToBeAdded = (Shopkeeper)user;
			shopkeeperList.add(shopkeeperToBeAdded);
		}
		return false;
	}
	
	
	@Override
	public User getUserByEmail(String email) {
		for(Customer c : customerList) {
			if(c.getEmail().equals(email)) {
				return c;
			}
		}
		for(Shopkeeper s : shopkeeperList) {
				if(	s.getEmail().equals(email)) {
					return s;
				}
			}  
		return null;
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}
}
