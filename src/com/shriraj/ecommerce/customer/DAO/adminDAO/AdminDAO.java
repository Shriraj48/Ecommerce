package com.shriraj.ecommerce.customer.DAO.admin.adminDAO;

import java.util.List;
import com.shriraj.ecommerce.customer.model.adminmodel.Admin;
import com.shriraj.ecommerce.customer.model.buyermodel.Customer;
import com.shriraj.ecommerce.customer.model.sellermodel.ShopKeeper;

public interface AdminDAO {
	 
	List<Customer> getAllCustomers();
	
	List<ShopKeeper> getAllShopkeeper();
		
	void addShopkeeper(ShopKeeper customerToBeAdded); 
		
	void deleteUser(int choiceCustomer,Customer customerToBeAdded,ShopKeeper shopkeeperToBeAdded);
	
	List<Admin> getAdmin();

}