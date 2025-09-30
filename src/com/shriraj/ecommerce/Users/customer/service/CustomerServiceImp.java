package com.shriraj.ecommerce.Users.customer.service;

import com.shriraj.ecommerce.Users.customer.DAO.CustomerDAO;
import com.shriraj.ecommerce.Users.customer.Exception.InvalidIdException;
import com.shriraj.ecommerce.Users.customer.model.Customer;
import com.shriraj.ecommerce.Users.user.DAO.UserDAO;
import com.shriraj.ecommerce.Users.user.Model.User;
import com.shriraj.ecommerce.Users.user.Service.UserServiceImp;

public class CustomerServiceImp extends UserServiceImp  implements CustomerService {
	private CustomerDAO customerdao;
	
	public CustomerServiceImp(UserDAO userdao,CustomerDAO customerdao) {
		super(userdao);
		this.customerdao = customerdao;
	}
	
	@Override
	public Customer checkProfile(int id) throws InvalidIdException{
		Customer u = customerdao.findById(id);
		if (u != null) {
	        return  u;   
	    }
		throw new InvalidIdException("Invalid Id");
	}

	@Override
	public void updateCredit(int id, double credit) throws InvalidIdException{
		Customer u = customerdao.findById(id);
		if(u != null) {
		 customerdao.update(id,credit);	
		}else {
		throw new InvalidIdException("Invalid Id");
		}
	}

	@Override
	public void forgotPassword(String email, String password) throws InvalidIdException{
		Customer u = (Customer) customerdao.getUserByEmail(email);
		if (u != null) {
			customerdao.changePasswordByEmailId(email, password);
		}else {
		throw new InvalidIdException("Invalid Id");
		}
	}
	
	@Override
	public void changeAddress(int id, String address) throws InvalidIdException{
		Customer u = customerdao.findById(id);
		if(u != null) {
			customerdao.addAddress(id, address);
		}else {
		throw new InvalidIdException("Invalid Id");
			}
		}
	

}

