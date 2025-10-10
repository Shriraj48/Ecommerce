package com.adi.ecommerce.user.customer.DAO;

import com.adi.ecommerce.user.customer.Entity.Profile;
import com.adi.ecommerce.user.user.DAO.UserDAO;

import java.util.Optional;

public interface CustomerDAO extends UserDAO {
    boolean updateCredit(String custId,double updatedCredit);
    Optional<Double> getCredit(String custId);

    boolean updateProfile(String custId, Profile updatedProfile);
    Optional<Profile> getProfile(String custId);
}
