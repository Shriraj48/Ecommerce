package com.adi.ecommerce.user.user.DAO;

import com.adi.ecommerce.user.user.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {
    List<User> getAllUsers();

    void addUser(User user);

    Optional<User> getUserByEmail(String email);

    Optional<User> getUserById(String id);

}
