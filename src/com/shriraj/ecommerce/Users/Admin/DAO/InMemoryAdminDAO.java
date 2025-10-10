package com.shriraj.ecommerce.Users.Admin.DAO;

import java.util.Iterator;
import java.util.List;

import com.shriraj.ecommerce.Users.Shopkeeper.Model.ShopDetails;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.Shopkeeper;
import com.shriraj.ecommerce.Users.Shopkeeper.registersystemforshopkeeper.RegisterSystemImplementation;
import com.shriraj.ecommerce.Users.customer.model.Customer;
import com.shriraj.ecommerce.Users.user.DAO.InMemoryUserDAO;
import com.shriraj.ecommerce.Users.user.Model.User;

public class InMemoryAdminDAO extends InMemoryUserDAO implements AdminDAO{

	private RegisterSystemImplementation register;
    private List<Shopkeeper> pendingRequests;

	public InMemoryAdminDAO(List<User> userList,RegisterSystemImplementation register,List<Shopkeeper> pendingRequests) {
		super(userList);
		this.register = register;
		this.pendingRequests = pendingRequests;
	}

	public List<User> getAllUsers(){
		return userList;
		
	}
	
//	public User getUserByEmail(String email) {
//		for(User u : userList) {
//		if(u instanceof Shopkeeper) {
//			Shopkeeper s = (Shopkeeper) u;
//			if(s.getEmail().equals(email)) {
//				return s;
//			}
//		} else if(u instanceof Customer){
//			Customer c = (Customer) u;
//			if(c.getEmail().equals(email)){
//				return c;
//			}
//		} 
//	}
//				return null;
//		
//	}
	
	@Override
	public void deleteUserbyId(int id) {
		Iterator<User> iterator = userList.iterator();
		while (iterator.hasNext()) {
			 User u = iterator.next();
			if(u instanceof Shopkeeper) {
				Shopkeeper s = (Shopkeeper) u;
				if(s.getId()==(id)) {
					iterator.remove();
					break;
				}
			} else if(u instanceof Customer){
				Customer s = (Customer) u;
				if(s.getId()==(id)) {
					iterator.remove();
					break;
				}
			}
		}
	}

	@Override
	public void deleteUserbyEmail(String email) {
		Iterator<User> iterator = userList.iterator();
		while (iterator.hasNext()) {
			 User u = iterator.next();
			if(u instanceof Shopkeeper) {
				Shopkeeper s = (Shopkeeper) u;
				if(s.getEmail()==(email)) {
					iterator.remove();
					break;
				}
			} else if(u instanceof Customer){
				Customer s = (Customer) u;
				if(s.getEmail()==(email)) {
					iterator.remove();
					break;
				}
			}
		}
	}

	public void addShopkeeper(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode) {
        	register.removePendingRequestOnApprove(  email,  shopkeeperPassword,  shopOwnerName,  shopName,  shopAddress, shopPincode);
        	userList.add( new Shopkeeper(email,shopkeeperPassword,new ShopDetails(shopOwnerName,  shopName,  shopAddress, shopPincode)));
       	}
	

    public void removeShopkeeper(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode) {
    		register.removePendingRequest(  email,  shopkeeperPassword,  shopOwnerName,  shopName,  shopAddress, shopPincode);
    	}

    public List<Shopkeeper> viewPendingRequests() {
        return register.getPendingRequests();
    }


}	

