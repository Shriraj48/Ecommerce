package com.shriraj.ecommerce.customer.model.sellermodel;

import com.shriraj.ecommerce.customer.model.usermodel.User;

public class ShopKeeper extends User {
	
	private int shopId;
	private String shopName;
	private String shopProducts;
	private String shopOrders;
	private double shopCredit;
	
	public ShopKeeper() {
		
	}
	public ShopKeeper(String email, String password,String shopName) {
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

	@Override
	public String toString() {
	    return "Customer{" +
	            "ID='" + getId() + '\'' +
	            ", email='" + getEmail() + '\'' +
	            ", password='" + getPassword() + '\'' +
	            ", Product='" + shopName + '\''+
	            ", Product='" + shopProducts + '\''+
	            ", credit='" + shopCredit + '\'' +
	            '}';
	}

}
