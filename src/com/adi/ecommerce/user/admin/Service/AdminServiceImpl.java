package com.adi.ecommerce.user.admin.Service;

import com.adi.ecommerce.user.admin.DAO.AdminDAO;
import com.adi.ecommerce.user.customer.Entity.Customer;
import com.adi.ecommerce.user.shopkeeper.Entity.Shopkeeper;
import com.adi.ecommerce.user.user.DAO.UserDAO;
import com.adi.ecommerce.user.user.Entity.User;
import com.adi.ecommerce.user.user.Exception.UserDoesNotExistException;
import com.adi.ecommerce.user.user.Service.UserServiceImpl;

import java.util.List;

public class AdminServiceImpl extends UserServiceImpl implements AdminService{

    private final AdminDAO adminDAO;

    public AdminServiceImpl(UserDAO userDAO, AdminDAO adminDAO) {
        super(userDAO);
        this.adminDAO = adminDAO;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return adminDAO.getAll(Customer.class);
    }

    @Override
    public List<Shopkeeper> getAllShopkeepers() {
        return adminDAO.getAll(Shopkeeper.class);
    }

    @Override
    public void approveOrRejectShopkeeper(String shopId) {

    }

    @Override
    public void deleteUser(String userId) throws UserDoesNotExistException {
        boolean deleted = adminDAO.deleteUser(userId);
        if (!deleted) {
            throw new UserDoesNotExistException("User doesnt exists");
        }
    }

}
