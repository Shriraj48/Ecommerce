package com.shriraj.ecommerce.Users.Admin.Model;

import com.shriraj.ecommerce.Users.Admin.observer.Observer;
import com.shriraj.ecommerce.Users.user.Model.User;

public class Admin extends User implements Observer {
	   
	public Admin(String email, String password) {
	    super(email, password);
	}

	@Override
	public String toString() {
	    return "Admin{" +
	            "ID='" + getId() + '\'' +
	            ", email='" + getEmail() + '\'' +
	            ", password='" + getPassword() + '\'' +
	            '}';
	    }

	@Override
	public void update(String message) {
		System.out.println( "[Admin " + getEmail() + "] Notification: " + message);
	}
}

