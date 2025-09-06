package com.shriraj.ecommerce.customer.service.sellerservice;

import java.util.List;
import com.shriraj.ecommerce.customer.DAO.sellerDAO.SellerDAO;
import com.shriraj.ecommerce.customer.model.sellermodel.SellerModel;
import com.shriraj.ecommerce.customer.service.serviceexception.EmailIdAlreadyUsedException;
import com.shriraj.ecommerce.customer.service.serviceexception.InvalidCredentialException;

public class SellerService {

private SellerDAO seller; 

	public SellerService(SellerDAO seller) {   
		this.seller = seller;
	}
	
	List<SellerModel> customerList = seller.getAllSellers();
	
	
	public void registerCustomer(String customerEmail, String customerPassword, String ShopName,String Address, String businessType, int bankAccountNumber) throws EmailIdAlreadyUsedException{    
		for(SellerModel c : customerList) {
			if(c.getCustomerEmail().equals(customerEmail)) {
				throw new EmailIdAlreadyUsedException("EmailID Already used"+customerEmail);
				 }
			}
		seller.addSeller(new SellerModel(customerEmail, customerPassword, ShopName,Address,businessType,bankAccountNumber));
		}
	
	
	
	
	public SellerModel loginCustomer(String customerEmail, String customerPassword) throws InvalidCredentialException{
		for(SellerModel c : customerList) {
			if(c.getCustomerEmail()==(customerEmail) && c.getCustomerPassword()==(customerPassword)){
			return c;
			}
		}
		throw new InvalidCredentialException("Invalid Password or EmailID");   
	}
	
	
}
