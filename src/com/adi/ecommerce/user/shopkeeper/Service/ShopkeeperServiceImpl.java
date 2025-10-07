package com.adi.ecommerce.user.shopkeeper.Service;

import com.adi.ecommerce.user.shopkeeper.DAO.ShopkeeperDAO;
import com.adi.ecommerce.user.shopkeeper.Entity.ShopDetails;
import com.adi.ecommerce.user.shopkeeper.Entity.Shopkeeper;
import com.adi.ecommerce.user.user.DAO.UserDAO;
import com.adi.ecommerce.user.user.Exception.UserDoesNotExistException;
import com.adi.ecommerce.user.user.Service.UserServiceImpl;

public class ShopkeeperServiceImpl extends UserServiceImpl implements ShopkeeperService {

    private final ShopkeeperDAO shopkeeperDAO;

    public ShopkeeperServiceImpl(ShopkeeperDAO shopkeeperDAO) {
        super(shopkeeperDAO);
        this.shopkeeperDAO = shopkeeperDAO;
    }

    @Override
    public void changeShopDetails(String shopId, ShopDetails shopDetails) throws UserDoesNotExistException{
        if(!shopkeeperDAO.editShopDetails(shopId,shopDetails)) {
            throw new UserDoesNotExistException("ShopKeeper Deosnt Exist");
        }
    }

    @Override
    public void requestShopApproval(String shopId) {

    }
}
