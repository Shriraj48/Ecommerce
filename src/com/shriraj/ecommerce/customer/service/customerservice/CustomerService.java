package com.shriraj.ecommerce.customer.service.buyerservice;
import java.util.List;
import com.shriraj.ecommerce.customer.DAO.buyerDAO.BuyerDAO;
import com.shriraj.ecommerce.customer.model.buyermodel.BuyerModel;
import com.shriraj.ecommerce.customer.service.serviceexception.EmailIdAlreadyUsedException;
import com.shriraj.ecommerce.customer.service.serviceexception.InvalidCredentialException;


public class CustomerService  {
//	private InMemoryCustomerDAO customer; //only valid for inmemorycustomer object 
	private BuyerDAO buyer; // hence making top base class object which valid for all dao operation
	
	public CustomerService(BuyerDAO customer) {   // constructor dependency injection
		this.customer = customer;
	}
	
	List<CustomerModel> buyerList = buyer.getAllBuyers();
	
	
	public void registerCustomer(String customerEmail, String customerPassword, double buyerCredit) throws EmailIdAlreadyUsedException{  
		for(BuyerModel c : buyerList) {
			if(c.getCustomerEmail().equals(customerEmail)) {
				throw new EmailIdAlreadyUsedException("EmailID Already used"+customerEmail);
				 }
			}
		buyer.addBuyer(new BuyerModel( customerEmail,  customerPassword,  buyerCredit));
		}
	
	
	
	
	public BuyerModel loginCustomer(String customerEmail, String customerPassword) throws InvalidCredentialException{
		for(BuyerModel c : buyerList) {
			if(c.getCustomerEmail().equals(customerEmail) && c.getCustomerPassword().equals(customerPassword)){
				return c;
			}
		}
		throw new InvalidCredentialException("Invalid Password or EmailID");   
	}
	
} 


