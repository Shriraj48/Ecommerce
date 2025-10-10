package com.shriraj.ecommerce.Users.Shopkeeper.registersystemforshopkeeper;

import java.util.List;
import com.shriraj.ecommerce.Users.Admin.observer.Observer;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.ShopDetails;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.Shopkeeper;
import com.shriraj.ecommerce.Users.Shopkeeper.observalable.Observable;
import com.shriraj.ecommerce.Users.user.DAO.UserDAO;
import com.shriraj.ecommerce.Users.user.Model.User;

public class RegisterSystemImplementation implements RegisterSystem,Observable  {

	    private List<Observer> observers; 
	    private List<Shopkeeper> pendingRequests;
	    private UserDAO userdao;
	
	    public  RegisterSystemImplementation (List<Observer> observers, List<Shopkeeper> pendingRequests, UserDAO userdao) {
	    	this.observers = observers;
	    	this.pendingRequests = pendingRequests;
	    	this.userdao = userdao;
	    }
	    
	    public void registerObserver(Observer observer) {
	        observers.add(observer);
	    }

	
	    public void removeObserver(Observer observer) {
	        observers.remove(observer);
	    }

	  
	    public void notifyObservers(String message) {
	        for (Observer observer : observers) {
	            observer.update(message);
	        }
	    }


	    public void addPendingRequest(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode) {
	         pendingRequests.add(new Shopkeeper(email,shopkeeperPassword,new ShopDetails(shopOwnerName,  shopName,  shopAddress, shopPincode)));
	         notifyObservers("New shopkeeper request: " + email);
	    }

	    public void removePendingRequest(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode) {
	    	pendingRequests.remove(new Shopkeeper(email,shopkeeperPassword,new ShopDetails(shopOwnerName,  shopName,  shopAddress, shopPincode)));
	    	notifyObservers("Rejected: " + email);
	    }
	    
	    public void removePendingRequestOnApprove(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode) {
	    	pendingRequests.remove(new Shopkeeper(email,shopkeeperPassword,new ShopDetails(shopOwnerName,  shopName,  shopAddress, shopPincode)));
	        
	    }

	    public List<Shopkeeper> getPendingRequests() {
	        return pendingRequests;
	    }
	    
	    public Shopkeeper getEmailIdFromPendingList(String email) {
	    	for(Shopkeeper s : pendingRequests) {
	    		if (s.getEmail().equals(email)) {  
	                return s;
	    		}
			}
	    	return null;
	    	}
	  
	}

	

	
	
	
	
	

