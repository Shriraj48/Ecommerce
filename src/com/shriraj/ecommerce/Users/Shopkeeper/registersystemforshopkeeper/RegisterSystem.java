package com.shriraj.ecommerce.Users.Shopkeeper.registersystemforshopkeeper;

import java.util.List;
import com.shriraj.ecommerce.Users.Admin.observer.Observer;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.ShopDetails;
import com.shriraj.ecommerce.Users.Shopkeeper.Model.Shopkeeper;
import com.shriraj.ecommerce.Users.Shopkeeper.Service.ShopkeeperService;

public interface RegisterSystem {
	
	     void registerObserver(Observer observer);

	     void removeObserver(Observer observer);

	     void notifyObservers(String message);
	    
	     void addPendingRequest(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode);
	    
	     void removePendingRequest(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode);

		 void removePendingRequestOnApprove(String email, String shopkeeperPassword, String shopOwnerName, String shopName, String shopAddress,Long shopPincode); 

	     List<Shopkeeper> getPendingRequests();
}
