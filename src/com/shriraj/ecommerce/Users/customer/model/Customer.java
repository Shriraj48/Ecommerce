package com.shriraj.ecommerce.Users.customer.model;

import com.shriraj.ecommerce.Users.user.Model.User;

public class Customer extends User{
	private int order;
	private String cart;
	private String address;
	private double credit;
	
	public Customer() {
		
	}
	
	public Customer(String email, String password, String address, double credit) {
		super(email, password);
		this.address = address;
		this.credit = credit;
	}
	   
	

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getCart() {
		return cart;
	}

	public void setCart(String cart) {
		this.cart = cart;
	}

	public double getCredit() {
		return credit;
	}

	public double setCredit(double credit) {
		return this.credit = credit;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
	    return "Customer{" +
	            "ID='" + getId() + '\'' +
	            ", email='" + getEmail() + '\'' +
	            ", password='" + getPassword() + '\'' +
	            ", credit='" + getCredit() + '\'' +
	            '}';
	}
}

