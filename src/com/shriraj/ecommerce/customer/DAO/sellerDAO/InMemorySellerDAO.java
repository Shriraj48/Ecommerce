package com.shriraj.ecommerce.customer.DAO.sellerDAO;

import java.util.ArrayList;
import java.util.List;


import com.shriraj.ecommerce.customer.model.sellermodel.SellerModel;

public class InMemorySellerDAO implements SellerDAO{
private List<SellerModel> sellerList;
	

	public InMemorySellerDAO() {
		this.sellerList = new ArrayList<>();
	}

	public List<SellerModel> getAllSellers(){
		return sellerList;
	}
	
	public List<String> getAllSellersEmailId(){ 
		List<String> emailList = new ArrayList<>();
		for(SellerModel c : sellerList) {
			emailList.add(c.getCustomerEmail());
		} 
		return emailList;
	}
	
	public  SellerModel getSellersByEmailId(String emailId) {
		for(SellerModel c : sellerList) {
			if(c.getCustomerEmail().equals(emailId)) {
				return c;
			}	
		}
		return null;
	}
	
	public void addSeller(SellerModel customerToBeAdded) {
		sellerList.add(customerToBeAdded);
	}
	
	public void deleteSeller(SellerModel customerToBeAdded) {
		sellerList.remove(customerToBeAdded);
	}	
}
