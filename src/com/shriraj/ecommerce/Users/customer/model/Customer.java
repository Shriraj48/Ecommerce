package com.shriraj.ecommerce.Users.customer.model;

import com.shriraj.ecommerce.Users.user.Model.User;

public class Customer extends User{
	private int order;
	private String cart;
	private double credit;
	private String Address;
	
	public Customer() {
		
	}
	
	public Customer(String email, String password,double credit) {
		super(email, password);
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
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String toString() {
	    return "Customer{" +
	            "ID='" + getId() + '\'' +
	            ", email='" + getEmail() + '\'' +
	            ", password='" + getPassword() + '\'' +
	            ", credit='" + getCredit() + '\'' +
	            ", address='" + getAddress() + '\'' +
	            '}';
	}
}

