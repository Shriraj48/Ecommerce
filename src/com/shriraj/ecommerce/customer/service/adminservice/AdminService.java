package com.shriraj.ecommerce.customer.service.adminservice;

import java.util.List;
import com.shriraj.ecommerce.customer.DAO.adminDAO.AdminDAO;
import com.shriraj.ecommerce.customer.DAO.buyerDAO.BuyerDAO;
import com.shriraj.ecommerce.customer.DAO.sellerDAO.SellerDAO;
import com.shriraj.ecommerce.customer.model.adminmodel.AdminModel;
import com.shriraj.ecommerce.customer.model.buyermodel.BuyerModel;
import com.shriraj.ecommerce.customer.model.sellermodel.SellerModel;
import com.shriraj.ecommerce.customer.service.roleService;
import com.shriraj.ecommerce.customer.service.serviceexception.EmailIdAlreadyUsedException;
import com.shriraj.ecommerce.customer.service.serviceexception.InvalidCredentialException;


public class AdminService {
	
	private AdminDAO  user; 
	private BuyerDAO  user2;
	private SellerDAO user3;
	
	public AdminService(AdminDAO user) {   
		this.user = user;
	}
	
	public AdminService(BuyerDAO  user2) {
		this.user2 = user2;
	}
	
	public AdminService(SellerDAO  user3) {
		this.user3 = user3;
	}
	
	List<AdminModel> adminList = user.getAllAdmins();
	List<BuyerModel> buyerList = user2.getAllBuyers();
	List<SellerModel> sellerList = user3.getAllSellers();
	

	
	public void registerCustomer(String customerEmail, String customerPassword, int userId) throws EmailIdAlreadyUsedException{    
		for(AdminModel c : adminList) {
			if(c.getCustomerEmail().equals(customerEmail)) {
				throw new EmailIdAlreadyUsedException("EmailID Already used"+customerEmail);
				 }
			}
		user.addAdmin(new AdminModel(customerEmail, customerPassword, userId));
		}
	
	
	
	public AdminModel loginCustomer(String customerEmail, String customerPassword) throws InvalidCredentialException{
		for(AdminModel c : adminList) {
			if(c.getCustomerEmail()==(customerEmail) && c.getCustomerPassword()==(customerPassword)){
			return c;
			}
		}
		throw new InvalidCredentialException("Invalid Password or EmailID");   
	}
	
	
	public void deleteBuyer(BuyerModel customerToBeAdded) {
		buyerList.remove(customerToBeAdded);
	}
	
	
	public void deleteSeller(SellerModel customerToBeAdded) {
		sellerList.remove(customerToBeAdded);
	}
	
	
	public void deleteAdmin(AdminModel customerToBeAdded) {
		adminList.remove(customerToBeAdded);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

