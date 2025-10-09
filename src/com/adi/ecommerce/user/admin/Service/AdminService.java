package com.adi.ecommerce.user.admin.Service;

import com.adi.ecommerce.user.customer.Entity.Customer;
import com.adi.ecommerce.user.shopkeeper.Entity.Shopkeeper;
import com.adi.ecommerce.user.user.Entity.User;
import com.adi.ecommerce.user.user.Exception.UserDoesNotExistException;
import com.adi.ecommerce.user.user.Service.UserService;

import java.util.List;

public interface AdminService extends UserService {
    List<Customer> getAllCustomers();
    List<Shopkeeper> getAllShopkeepers();
    void approveOrRejectShopkeeper(String shopId);
    void deleteUser(String userId) throws UserDoesNotExistException;
}
