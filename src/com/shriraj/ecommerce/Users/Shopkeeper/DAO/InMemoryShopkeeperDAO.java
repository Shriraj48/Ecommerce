package com.shriraj.ecommerce.Users.Shopkeeper.DAO;

import java.util.List;

import com.shriraj.ecommerce.Users.Shopkeeper.Model.ShopDetails;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.Shopkeeper;
import com.shriraj.ecommerce.Users.Shopkeeper.registersystemforshopkeeper.RegisterSystemImplementation;
import com.shriraj.ecommerce.Users.user.DAO.InMemoryUserDAO;
import com.shriraj.ecommerce.Users.user.Model.User;

public class InMemoryShopkeeperDAO extends InMemoryUserDAO implements ShopkeeperDAO{
	
	private RegisterSystemImplementation register;
	
	public InMemoryShopkeeperDAO(List<User> userList,RegisterSystemImplementation register) {
		super(userList);
		this.register = register;
	}

	@Override
	public void editShopDetails(String shopOwnerName, String shopName, String shopAddress, Long shopPincode) {
		for(User u : userList) {
			if(u instanceof Shopkeeper) {
				Shopkeeper s = (Shopkeeper) u;
				s.setShopDetails(new ShopDetails(shopOwnerName, shopName, shopAddress, shopPincode));
				}
			}
		}

	public void shokeeperRequest(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode) {
        register.addPendingRequest(email,shopkeeperPassword,shopOwnerName,  shopName,  shopAddress, shopPincode);
    }
	
}
