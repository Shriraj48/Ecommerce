package com.shriraj.ecommerce.customer.DAO.buyerDAO;

import java.util.ArrayList;
import java.util.List;

import com.shriraj.ecommerce.customer.model.buyermodel.BuyerModel;

public class InMemoryBuyerDAO implements BuyerDAO {
private List<BuyerModel> buyerList;
	

	public InMemoryBuyerDAO() {
		this.buyerList = new ArrayList<>();
	}

	public List<BuyerModel> getAllBuyers(){
		return buyerList;
	}
	
	public List<String> getAllBuyersEmailId(){ 
		List<String> emailList = new ArrayList<>();
		for(BuyerModel c : buyerList) {
			emailList.add(c.getCustomerEmail());
		} 
		return emailList;
	}
	
	public BuyerModel getBuyersByEmailId(String emailId) {
		for(BuyerModel c : buyerList) {
			if(c.getCustomerEmail().equals(emailId)) {
				return c;
			}	
		}
		return null;
	}
	
	public void addBuyer(BuyerModel customerToBeAdded) {
		buyerList.add(customerToBeAdded);
	}
	
	public void deleteBuyer(BuyerModel customerToBeAdded) {
		buyerList.remove(customerToBeAdded);
	}	
}
