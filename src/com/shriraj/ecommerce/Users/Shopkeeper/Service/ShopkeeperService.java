package com.shriraj.ecommerce.Users.Shopkeeper.Service;

import com.shriraj.ecommerce.Users.Shopkeeper.Model.ShopDetails;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.Shopkeeper;
import com.shriraj.ecommerce.Users.user.Service.UserService;

public interface ShopkeeperService extends UserService {
	
	void updateShopDetails(String shopkeeperEmail, String shopOwnerName, String shopName, String shopAddress,Long shopPincode);
	
	void requestToAdmin(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode);
}
