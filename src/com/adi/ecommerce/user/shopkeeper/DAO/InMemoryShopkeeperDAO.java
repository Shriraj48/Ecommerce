package com.adi.ecommerce.user.shopkeeper.DAO;

import com.adi.ecommerce.user.shopkeeper.Entity.ShopDetails;
import com.adi.ecommerce.user.shopkeeper.Entity.Shopkeeper;
import com.adi.ecommerce.user.user.DAO.InMemoryUserDAO;
import com.adi.ecommerce.user.user.Entity.User;
import com.adi.ecommerce.user.user.Exception.UserDoesNotExistException;

import java.util.List;
import java.util.Optional;

public class InMemoryShopkeeperDAO extends InMemoryUserDAO implements ShopkeeperDAO {

    public InMemoryShopkeeperDAO(List<User> userList) {
        super(userList);
    }

    @Override
    public boolean editShopDetails(String shopId, ShopDetails shopDetails) {
//        Optional<User> shopkeeper = getUserById(shopId);
//        if(shopkeeper == null){
//            return false;
//        }
//        Shopkeeper shopkeeperToBeUpdated = (Shopkeeper) shopkeeper;

        return getUserById(shopId)
                .filter(u -> u instanceof Shopkeeper)
                .map(u -> (Shopkeeper) u)
                .map(s -> {
                    s.setShopDetails(shopDetails);
                    return true;
                })
                .orElse(false);
    }

    @Override
    public void requestToAdminForApproval(String shopId) {

    }
}
