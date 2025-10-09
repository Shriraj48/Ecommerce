package com.adi.ecommerce.user.customer.DAO;

import com.adi.ecommerce.user.customer.Entity.Customer;
import com.adi.ecommerce.user.customer.Entity.Profile;
import com.adi.ecommerce.user.user.DAO.InMemoryUserDAO;
import com.adi.ecommerce.user.user.Entity.User;
import java.util.List;
import java.util.Optional;

public class InMemoryCustomerDAO extends InMemoryUserDAO implements CustomerDAO{
    public InMemoryCustomerDAO(List<User> userList) {
        super(userList);
    }

//    @Override
//    public boolean updateCredit(String custId, double updatedCredit) {
//        Customer customerCreditToBeUpdated = getCustomerById(custId);
//        if(customerCreditToBeUpdated == null){
//            return false;
//        }
//        customerCreditToBeUpdated.setCustomerCredit(updatedCredit);
//        return true;
//    }
//
//    @Override
//    public double getCredit(String custId) {
//        return getCustomerById(custId).getCustomerCredit();
//    }
//
//    @Override
//    public boolean updateProfile(String custId, Profile updatedProfile) {
//        Customer customerProfileToBeUpdated = getCustomerById(custId);
//        if(customerProfileToBeUpdated == null){
//            return false;
//        }
//        customerProfileToBeUpdated.setCustomerProfile(updatedProfile);
//        return true;
//    }
//
//    @Override
//    public Profile getProfile(String custId) {
//        return getCustomerById(custId).getCustomerProfile();
//    }

//    private Customer getCustomerById(String custId){
//        return (Customer) getAllUsers().stream()
//                .filter(u -> u.getUserId().equals(custId) && u instanceof Customer)
//                .findFirst().orElse(null);
//    }

    @Override
    public boolean updateCredit(String custId, double updatedCredit) {
        return getCustomerById(custId)
                .map(c -> {
                    c.setCustomerCredit(updatedCredit);
                    return true;
                })
                .orElse(false);
    }

    @Override
    public Optional<Double> getCredit(String custId) {
        return getCustomerById(custId)
                .map(Customer::getCustomerCredit);
    }

    @Override
    public boolean updateProfile(String custId, Profile updatedProfile) {
        return getCustomerById(custId)
                .map(c -> {
                    c.setCustomerProfile(updatedProfile);
                    return true;
                })
                .orElse(false);
    }

    @Override
    public Optional<Profile> getProfile(String custId) {
        return getCustomerById(custId)
                .map(Customer::getCustomerProfile);
    }

    private Optional<Customer> getCustomerById(String custId) {
        return getUserById(custId)
                .filter(u -> u instanceof Customer)
                .map(u -> (Customer) u);
    }
}
