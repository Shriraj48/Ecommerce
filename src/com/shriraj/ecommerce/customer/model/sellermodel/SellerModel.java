package com.shriraj.ecommerce.customer.model.sellermodel;

import com.shriraj.ecommerce.customer.model.adminmodel.AdminModel;

public class SellerModel extends AdminModel {
	private static int count = 1; 
	private int sellerId;
	private String ShopName;
	private String Address;
	private String businessType;
	private int bankAccountNumber;
	
	public SellerModel() {
		
	}
	   
	public SellerModel(String customerEmail, String customerPassword, String ShopName,String Address, String businessType, int bankAccountNumber) {
	   this.customerEmail = customerEmail;
	   this.customerPassword = customerPassword;
//		this.sellerId = count++;
	    this.ShopName = ShopName; 
	    this.Address = Address;
	    this.businessType = businessType;
	    this.bankAccountNumber = bankAccountNumber; 
	    
	}
	
	 public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		SellerModel.count = count;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getShopName() {
		return ShopName;
	}

	public void setShopName(String shopName) {
		ShopName = shopName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	 public String toString() {
	     return "Customer{" +
	             "email='" + buyerEmail + '\'' +
	             ", password='" + customerPassword + '\'' +
	             ", credit=' " + customerCredit + '\'' +
	             '}';
	 }

}
