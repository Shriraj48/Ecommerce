package com.shriraj.ecommerce.Users.Admin.DAO;

import com.shriraj.ecommerce.Users.Shopkeeper.Model.ShopDetails;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.Shopkeeper;
import com.shriraj.ecommerce.Users.user.DAO.*;
import com.shriraj.ecommerce.Users.user.Model.*;
import java.util.List;

public interface AdminDAO extends UserDAO  {
	
	List<User> getAllUsers();
	
	User getUserByEmail(String email);
	
	void deleteUserbyId(int id);
	
	void deleteUserbyEmail(String email);
	  
	void addShopkeeper(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode);

    void removeShopkeeper(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode);
    
    List<Shopkeeper> viewPendingRequests();
	
}
