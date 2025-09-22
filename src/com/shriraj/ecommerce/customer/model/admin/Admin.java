package com.shriraj.ecommerce.customer.model.admin;

import com.shriraj.ecommerce.user.Model.User;

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

