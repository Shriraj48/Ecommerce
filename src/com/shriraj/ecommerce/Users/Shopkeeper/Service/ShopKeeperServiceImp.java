package com.shriraj.ecommerce.Users.Shopkeeper.Service;

import com.shriraj.ecommerce.Users.Shopkeeper.DAO.ShopkeeperDAO;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.ShopDetails;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.Shopkeeper;
import com.shriraj.ecommerce.Users.user.DAO.UserDAO;
import com.shriraj.ecommerce.Users.user.Model.User;
import com.shriraj.ecommerce.Users.user.Service.UserServiceImp;

public class ShopKeeperServiceImp extends UserServiceImp implements ShopkeeperService {
	private ShopkeeperDAO shopkeeperdao;
	
	public ShopKeeperServiceImp(UserDAO userdao,ShopkeeperDAO shopkeeperdao) {
		super(userdao);
		this.shopkeeperdao = shopkeeperdao;
	}

	@Override
	public void updateShopDetails(String shopEmail, String shopOwnerName, String shopName, String shopAddress, Long shopPincode) {
		User u = shopkeeperdao.getUserByEmail(shopEmail);
		if(u != null) {
			shopkeeperdao.editShopDetails(shopOwnerName, shopName, shopAddress, shopPincode);
		}
	}

	@Override
	public void requestToAdmin(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode) {
			shopkeeperdao.shokeeperRequest( email,shopkeeperPassword,shopOwnerName,  shopName,  shopAddress, shopPincode);
		
	}

}
