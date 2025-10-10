package com.shriraj.ecommerce.Users.Admin.Service;

import java.util.List;

import com.shriraj.ecommerce.Users.Admin.DAO.AdminDAO;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.ShopDetails;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.Shopkeeper;
import com.shriraj.ecommerce.Users.Shopkeeper.registersystemforshopkeeper.RegisterSystemImplementation;
import com.shriraj.ecommerce.Users.customer.model.Customer;
import com.shriraj.ecommerce.Users.user.DAO.UserDAO;
import com.shriraj.ecommerce.Users.user.Exception.UserNotExistException;
import com.shriraj.ecommerce.Users.user.Model.User;
import com.shriraj.ecommerce.Users.user.Service.UserServiceImp;

public class AdminServiceImp extends UserServiceImp implements AdminService {
	private AdminDAO admindao;
	private RegisterSystemImplementation register;
	
	public AdminServiceImp(UserDAO userdao,AdminDAO admindao,RegisterSystemImplementation register) {
		super(userdao);
		this.admindao = admindao;
		this.register = register;
	}

	@Override
	public void deleteUserById(int id) {
		admindao.deleteUserbyId(id);
	}

	@Override
	public void deleteUserByEmail(String email) {
		admindao.deleteUserbyEmail(email);
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		User u = admindao.getUserByEmail(email);
		if(u instanceof Customer)	{
			Customer c = (Customer) u;
		if(c != null) {
			return c;
			}
		}
		return null;
		}

	@Override
	public Shopkeeper getShopkeeperbyEmail(String email) {
		User u = admindao.getUserByEmail(email);
		if(u instanceof Shopkeeper)	{
			Shopkeeper s = (Shopkeeper) u;
		if(s != null) {
			return s;
			}
		}
		return null;
		}
	
	public void approvedRequest(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode) throws UserNotExistException  {
			Shopkeeper s = register.getEmailIdFromPendingList(email);
			if(s != null) {		
        		admindao.addShopkeeper(  email,  shopkeeperPassword,  shopOwnerName,  shopName,  shopAddress, shopPincode); 
        	}else {
			 throw new UserNotExistException(email + " not found in pending requests.");
		 }
        	}
		
			
	
	
	public void rejectRequest(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode) throws UserNotExistException {
		Shopkeeper s = register.getEmailIdFromPendingList(email);
    	if(s != null) {
    		admindao.removeShopkeeper(  email,  shopkeeperPassword,  shopOwnerName,  shopName,  shopAddress, shopPincode);
    	}else {
    		throw new UserNotExistException(email + " not found in pending requests.");
	 }
    	}
			
		
	
		
	public List<Shopkeeper> getAllPendingRequest() {
		return admindao.viewPendingRequests();
	}
	
	

}
