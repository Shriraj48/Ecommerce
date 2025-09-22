package com.shriraj.ecommerce.Users.Shopkeeper.Model;

import com.shriraj.ecommerce.Users.user.Model.User;

public class Shopkeeper extends User {
	
	private int shopId;
	private String shopName;
	private String shopProducts;
	private String shopOrders;
	private double shopCredit;
	
	public Shopkeeper() {
		
	}
	public Shopkeeper(String email, String password,String shopName) {
		super(email, password);
		this.shopName = shopName;
	}
	
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopProducts() {
		return shopProducts;
	}
	public void setShopProducts(String shopProducts) {
		this.shopProducts = shopProducts;
	}
	public String getShopOrders() {
		return shopOrders;
	}
	public void setShopOrders(String shopOrders) {
		this.shopOrders = shopOrders;
	}
	public double getShopCredit() {
		return shopCredit;
	}
	public void setShopCredit(double shopCredit) {
		this.shopCredit = shopCredit;
	}

	public String toString() {
	    return "Shopkeeper{" +
	            "ID='" + getId() + '\'' +
	            ", email='" + getEmail() + '\'' +
	            ", password='" + getPassword() + '\'' +
	            ", Product='" + shopName + '\''+
	            ", Product='" + shopProducts + '\''+
	            ", credit='" + shopCredit + '\'' +
	            '}';
	}

}
