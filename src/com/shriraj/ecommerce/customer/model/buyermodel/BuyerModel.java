package com.shriraj.ecommerce.customer.model.buyermodel;

import com.shriraj.ecommerce.customer.model.adminmodel.AdminModel;

public class BuyerModel extends AdminModel{
	private static int count = 1; 
	private int buyerId;
	private double buyerCredit;
	
	
	
	public BuyerModel(String customerEmail, String customerPassword, double buyerCredit) {
		this.customerEmail = customerEmail;
		this.customerPassword = customerEmail;
		this.buyerCredit = buyerCredit;
	}
	   
	public BuyerModel() {
	   
	    
	}
	
	 public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		BuyerModel.count = count;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public double getBuyerCredit() {
		return buyerCredit;
	}

	public void setBuyerCredit(double buyerCredit) {
		this.buyerCredit = buyerCredit;
	}

	@Override
	public String toString() {
	     return "Customer{" +
	    		 "Id='" + userId + '\'' +
	             "email='" + customerEmail + '\'' +
	             ", password='" + customerPassword + '\'' +
	             ", credit=' " + buyerCredit + '\'' +
	             '}';

}
