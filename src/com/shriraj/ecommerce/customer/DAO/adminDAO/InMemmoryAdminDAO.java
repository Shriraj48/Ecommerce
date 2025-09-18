package com.shriraj.ecommerce.customer.DAO.admin.adminDAO;

import java.util.List;
import com.shriraj.ecommerce.customer.DAO.buyerDAO.CustomerDAO;
import com.shriraj.ecommerce.customer.DAO.sellerDAO.ShopkeeperDAO;
import com.shriraj.ecommerce.customer.DAOuserDAO.InMemoryUserDAO;
import com.shriraj.ecommerce.customer.model.adminmodel.Admin;
import com.shriraj.ecommerce.customer.model.buyermodel.Customer;
import com.shriraj.ecommerce.customer.model.sellermodel.ShopKeeper;

public class InMemmoryAdminDAO extends InMemoryUserDAO implements AdminDAO{
	

	private CustomerDAO customer;
	private ShopkeeperDAO shopkeeper;
	private List<Admin> adminList;
	
	public InMemmoryAdminDAO() {
		
	}
	
	public InMemmoryAdminDAO(CustomerDAO customer, ShopkeeperDAO shopkeeper, AdminDAO admin,List<Admin> adminList) {
		super(customer, shopkeeper, admin);
		this.adminList = adminList;
	}
	
	List<Customer> CustomerList = customer.getAllCustomers(); // Never make this it occupy memmory
	List<ShopKeeper> shopkeeperList = shopkeeper.getAllShopkeepers();
	
	@Override
	public List<Customer> getAllCustomers(){
		return customer.getAllCustomers();
	}
	
	@Override
	public List<ShopKeeper> getAllShopkeeper(){
		return shopkeeper.getAllShopkeepers();
	}

	@Override
	public void addShopkeeper(ShopKeeper customerToBeAdded) {
	shopkeeperList.add(customerToBeAdded);
	}


	@Override
	public void deleteUser(int choice,Customer customerToBeAdded,ShopKeeper shopkeeperToBeAdded) {	
	switch(choice) {
	case (1) : CustomerList.remove(customerToBeAdded);
		break;
	
	case (2) : shopkeeperList.remove(shopkeeperToBeAdded);
		break;
	  }
}

	@Override
	public List<Admin> getAdmin() {
		return adminList;
	}

	
}

