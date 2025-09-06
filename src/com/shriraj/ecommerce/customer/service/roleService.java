package com.shriraj.ecommerce.customer.service;

import com.shriraj.ecommerce.customer.model.adminmodel.AdminModel;
import com.shriraj.ecommerce.customer.model.buyermodel.BuyerModel;
import com.shriraj.ecommerce.customer.model.sellermodel.SellerModel;
import com.shriraj.ecommerce.customer.service.serviceexception.EmailIdAlreadyUsedException;
import com.shriraj.ecommerce.customer.service.serviceexception.InvalidCredentialException;

public interface roleService {

	void registerCustomer(String customerEmail, String customerPassword, int userId) throws EmailIdAlreadyUsedException;

	AdminModel loginCustomer(String customerEmail, String customerPassword) throws InvalidCredentialException;
	
	void deleteBuyer(BuyerModel customerToBeAdded);
	
	void deleteSeller(SellerModel customerToBeAdded);
	
	void deleteAdmin(AdminModel customerToBeAdded);
}
