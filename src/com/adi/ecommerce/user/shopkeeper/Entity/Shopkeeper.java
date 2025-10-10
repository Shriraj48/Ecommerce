package com.adi.ecommerce.user.shopkeeper.Entity;

import com.adi.ecommerce.user.user.Entity.User;

public class Shopkeeper extends User {
    private String shopId;
    private ShopDetails ShopDetails;
    private boolean shopValid;

    public Shopkeeper(String shopEmail,String shopPassword,String  shopId, ShopDetails shopDetails) {
        super(shopEmail,shopPassword);
        this.shopId = shopId;
        ShopDetails = shopDetails;
        this.shopValid = false;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public ShopDetails getShopDetails() {
        return ShopDetails;
    }

    public void setShopDetails(ShopDetails shopDetails) {
        ShopDetails = shopDetails;
    }

    public boolean isShopValid() {
        return shopValid;
    }

    public void setShopValid(boolean shopValid) {
        this.shopValid = shopValid;
    }

    @Override
    public String toString() {
        return "Shopkeeper{" +
                "shopId=" + shopId +
                ", ShopDetails=" + ShopDetails +
                ", shopValid=" + shopValid +
                '}';
    }
}
