package com.shriraj.ecommerce.Users.Shopkeeper.DAO;

import com.shriraj.ecommerce.Users.user.DAO.UserDAO;

public interface ShopkeeperDAO extends UserDAO {	
	void editShopDetails(String shopOwnerName, String shopName, String shopAddress, Long shopPincode);
	
	void shokeeperRequest(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode);
    }

