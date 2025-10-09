package com.adi.ecommerce.user.user.DAO;

import com.adi.ecommerce.user.user.Entity.User;

import java.util.List;
import java.util.Optional;

public abstract class InMemoryUserDAO implements UserDAO{
    private final List<User> userList;

    public InMemoryUserDAO(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userList.stream()
                .filter(u -> u.getUserEmail().equals(email))
                .findFirst();
    }

    @Override
    public Optional<User> getUserById(String id) {
        return userList.stream()
                .filter(u -> u.getUserId().equals(id))
                .findFirst();
    }
}
