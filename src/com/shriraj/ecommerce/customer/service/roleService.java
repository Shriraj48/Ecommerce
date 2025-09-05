package com.shriraj.ecommerce.customer.service;

import com.shriraj.ecommerce.customer.model.Customer;

public interface roleService {

	void registerCustomer(String customerEmail, String customerPassword, double customerCredit);

	Customer loginCustomer(String customerEmail, String customerPassword);
}
