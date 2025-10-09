package com.adi.ecommerce.user.customer.Service;

import com.adi.ecommerce.user.customer.Entity.Profile;
import com.adi.ecommerce.user.user.Exception.UserDoesNotExistException;
import com.adi.ecommerce.user.user.Service.UserService;

import java.util.Optional;

public interface CustomerService extends UserService {
    boolean updateCustomerCredit(String custId,double updatedCredit) throws UserDoesNotExistException;
    Optional<Double> getCustomerCredit(String custId);

    boolean updateCustomerProfile(String custId,Profile updatedProfile) throws UserDoesNotExistException;
    Optional<Profile> getCustomerProfile(String custId);
}
