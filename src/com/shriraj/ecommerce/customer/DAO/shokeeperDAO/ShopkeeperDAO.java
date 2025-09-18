package com.shriraj.ecommerce.customer.DAO.sellerDAO;

import java.util.List;

import com.shriraj.ecommerce.customer.model.sellermodel.ShopKeeper;



public interface ShopkeeperDAO {
	
	public List<ShopKeeper> getAllShopkeepers();
			
	 double getCredit(String emailId); 
		
	 void getShopOrder(); 
		
}
