package com.adi.ecommerce.user.user.Service;

import com.adi.ecommerce.user.user.DAO.UserDAO;
import com.adi.ecommerce.user.user.Entity.User;
import com.adi.ecommerce.user.user.Exception.UserAlreadyExistException;
import com.adi.ecommerce.user.user.Exception.UserDoesNotExistException;
import com.adi.ecommerce.user.user.Exception.UserNeedToLoginException;
import com.adi.ecommerce.user.user.Exception.UserPasswordDoesntMatchException;

import java.util.UUID;

public class UserServiceImpl implements UserService{
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean RegisterUser(User user) throws UserAlreadyExistException{
        if(userDAO.getUserById(user.getUserId()).isPresent()){
            throw new UserAlreadyExistException("User Already Exists!! Please Login");
        }
        userDAO.addUser(user);
        return true;
    }

    @Override
    public User LoginUser(String email, String password) throws UserDoesNotExistException,UserPasswordDoesntMatchException {
        User userToBeLoggedIn = userDAO.getUserByEmail(email)
                .orElseThrow(() -> new UserDoesNotExistException("User dosnent exist!! Please register"));
        if (!userToBeLoggedIn.getUserPassword().equals(password)) {
            throw new UserPasswordDoesntMatchException("User Password Doesnt Match, Please reytt");
        }
        userToBeLoggedIn.setUserToken(UUID.randomUUID().toString().replaceAll("-", ""));
        return userToBeLoggedIn;
    }


    @Override
    public boolean LogoutUser(User user) throws UserNeedToLoginException{
        if(user.getUserToken().isEmpty()){
            throw new UserNeedToLoginException("No User with Token Found!! Login First");
        }
        user.setUserToken(null);
        return true;
    }
}
