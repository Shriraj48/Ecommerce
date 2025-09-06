package com.shriraj.ecommerce.customer.DAO.sellerDAO;

import java.util.List;

import com.shriraj.ecommerce.customer.model.sellermodel.SellerModel;


public interface SellerDAO {
	 List<SellerModel> getAllSellers();
		
	 List<String> getAllSellersEmailId();
		
	 SellerModel getSellersByEmailId(String emailId); 
		
	 void addSeller(SellerModel customerToBeAdded); 
		
	 void deleteSeller(SellerModel customerToBeAdded);
}
