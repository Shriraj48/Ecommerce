package com.shriraj.ecommerce.Users.Admin.Service;

import java.util.List;

import com.shriraj.ecommerce.Users.Shopkeeper.Model.ShopDetails;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.Shopkeeper;
import com.shriraj.ecommerce.Users.Shopkeeper.Service.ShopkeeperService;
import com.shriraj.ecommerce.Users.customer.model.Customer;
import com.shriraj.ecommerce.Users.user.Exception.UserNotExistException;
import com.shriraj.ecommerce.Users.user.Model.User;
import com.shriraj.ecommerce.Users.user.Service.UserService;

public interface AdminService extends UserService{
	
	Customer getCustomerByEmail(String email);
	
	Shopkeeper getShopkeeperbyEmail(String email);
	
	void deleteUserById(int id);
	
	void deleteUserByEmail(String email);
	
	void approvedRequest(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode) throws UserNotExistException;
	
	void rejectRequest(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode)throws UserNotExistException;
	
	List<Shopkeeper> viewPendingRequests();
}
