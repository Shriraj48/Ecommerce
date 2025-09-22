package com.shriraj.ecommerce.customer.model.user;

public class User {
	private static int count = 1; 
	private int id;
	private String email;
	private String password;
//	private Role userRole;
	
	public User() {
		
	}
	
	public User(String email, String password) {
		this.id = count++;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
	    return "Customer{" +
	            "ID='" + getId() + '\'' +
	            ", email='" + getEmail() + '\'' +
	            ", password='" + getPassword() + '\'' +
	            '}';
	}
}
