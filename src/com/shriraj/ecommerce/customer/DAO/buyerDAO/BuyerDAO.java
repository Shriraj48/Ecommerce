package com.shriraj.ecommerce.customer.DAO.buyerDAO;

import java.util.List;

import com.shriraj.ecommerce.customer.model.buyermodel.BuyerModel;



public interface BuyerDAO {
	 List<BuyerModel> getAllBuyers();
		
	 List<String> getAllBuyersEmailId();
		
	 BuyerModel getBuyersByEmailId(String emailId); 
		
	 void addBuyer(BuyerModel customerToBeAdded); 
		
	 void deleteBuyer(BuyerModel customerToBeAdded);
}

