package com.adi.ecommerce.user.shopkeeper.DAO;

import com.adi.ecommerce.user.shopkeeper.Entity.ShopDetails;
import com.adi.ecommerce.user.user.DAO.UserDAO;

import java.util.List;

public interface ShopkeeperDAO extends UserDAO {
    boolean editShopDetails(String shopId, ShopDetails shopDetails);
    void requestToAdminForApproval(String shopId);
}
