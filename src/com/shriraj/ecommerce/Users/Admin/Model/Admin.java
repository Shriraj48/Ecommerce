package com.shriraj.ecommerce.Users.Admin.Model;

import com.shriraj.ecommerce.Users.user.Model.User;

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

