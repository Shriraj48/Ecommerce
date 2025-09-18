package com.shriraj.ecommerce.customer.model.admin;

import com.shriraj.ecommerce.customer.model.user.User;

public class Admin extends User {
	   
	public Admin(String email, String password) {
	    super(email, password);
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

