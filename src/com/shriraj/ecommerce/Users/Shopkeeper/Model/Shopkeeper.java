package com.shriraj.ecommerce.Users.Shopkeeper.Model;

import com.shriraj.ecommerce.Users.user.Model.User;

public class Shopkeeper extends User {
    private ShopDetails shopDetails;
    private boolean shopValid;
    private boolean approved;

    

	public Shopkeeper(String shopkeeperemail, String shopkeeperPassword,ShopDetails shopDetails) {
        super(shopkeeperemail,shopkeeperPassword);
        this.shopDetails = shopDetails;
        this.shopValid = false;
        this.approved = false;
    }


    public ShopDetails getShopDetails() {
        return shopDetails;
    }

    public void setShopDetails(ShopDetails shopDetails) {
        this.shopDetails = shopDetails;
    }

    public boolean isShopValid() {
        return shopValid;
    }

    public void setShopValid(boolean shopValid) {
        this.shopValid = shopValid;
    }
    
    public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

    @Override
    public String toString() {
        return "Shopkeeper{" +
        		"ID=" + getId() +
        		", email=" + getEmail() +
        		", Password=" + getPassword() +
                ", ShopDetails=" + shopDetails +
                ", shopValid=" + shopValid +
                '}';
    }
}
