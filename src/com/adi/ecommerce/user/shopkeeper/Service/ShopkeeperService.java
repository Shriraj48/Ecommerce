package com.adi.ecommerce.user.shopkeeper.Service;

import com.adi.ecommerce.user.shopkeeper.Entity.ShopDetails;
import com.adi.ecommerce.user.user.Exception.UserDoesNotExistException;

public interface ShopkeeperService {
    void changeShopDetails(String shopId, ShopDetails shopDetails) throws UserDoesNotExistException;
    void requestShopApproval(String shopId);
}
