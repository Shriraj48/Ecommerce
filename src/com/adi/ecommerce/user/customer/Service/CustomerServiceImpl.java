package com.adi.ecommerce.user.customer.Service;

import com.adi.ecommerce.user.customer.DAO.CustomerDAO;
import com.adi.ecommerce.user.customer.Entity.Profile;
import com.adi.ecommerce.user.user.Exception.UserDoesNotExistException;
import com.adi.ecommerce.user.user.Service.UserServiceImpl;

import java.util.Optional;


public class CustomerServiceImpl extends UserServiceImpl implements CustomerService{
    private final CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        super(customerDAO);
        this.customerDAO = customerDAO;
    }

    @Override
    public boolean updateCustomerCredit(String custId, double updatedCredit) throws UserDoesNotExistException {
        if(!customerDAO.updateCredit(custId,updatedCredit)){
            throw new UserDoesNotExistException("User Doesnt exist");
        }
        return true;
    }

    @Override
    public Optional<Double> getCustomerCredit(String custId) {
        return customerDAO.getCredit(custId);
    }

    @Override
    public boolean updateCustomerProfile(String custId, Profile updatedProfile) throws UserDoesNotExistException {
        if(!customerDAO.updateProfile(custId,updatedProfile)){
            throw new UserDoesNotExistException("User Doesnt exist");
        }
        return true;
    }

    @Override
    public Optional<Profile> getCustomerProfile(String custId) {
        return customerDAO.getProfile(custId);
    }
}
