package com.adi.ecommerce.user.shopkeeper.Entity;

public class ShopDetails {
    private String shopOwnerName;
    private String shopName;
    private String shopAddress;
    private Long shopPincode;

    public ShopDetails(String shopOwnerName, String shopName, String shopAddress, Long shopPincode) {
        this.shopOwnerName = shopOwnerName;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopPincode = shopPincode;
    }

    public String getShopOwnerName() {
        return shopOwnerName;
    }

    public void setShopOwnerName(String shopOwnerName) {
        this.shopOwnerName = shopOwnerName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Long getShopPincode() {
        return shopPincode;
    }

    public void setShopPincode(Long shopPincode) {
        this.shopPincode = shopPincode;
    }

    @Override
    public String toString() {
        return "ShopDetails{" +
                "shopOwnerName='" + shopOwnerName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", shopPincode=" + shopPincode +
                '}';
    }
}
