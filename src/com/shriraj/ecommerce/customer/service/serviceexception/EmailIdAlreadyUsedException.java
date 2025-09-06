package com.shriraj.ecommerce.customer.service.serviceexception;

public class EmailIdAlreadyUsedException extends Exception{
	public EmailIdAlreadyUsedException(String message) {
		super(message);
	}
}
