package com.shriraj.ecommerce.Users.Shopkeeper.observalable;

import com.shriraj.ecommerce.Users.Admin.observer.Observer;

public interface Observable  {
	 void registerObserver(Observer observer);
	 
	 void removeObserver(Observer observer);
	 
	 void notifyObservers(String message);
	
}
