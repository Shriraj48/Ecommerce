package com.shriraj.ecommerce.customer.service;

public class EmailIdAlreadyUsed extends Exception{
	public EmailIdAlreadyUsed(String message) {
		super(message);
	}
}
