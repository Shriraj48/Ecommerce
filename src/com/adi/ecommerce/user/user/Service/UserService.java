package com.adi.ecommerce.user.user.Service;

import com.adi.ecommerce.user.user.Entity.User;
import com.adi.ecommerce.user.user.Exception.UserAlreadyExistException;
import com.adi.ecommerce.user.user.Exception.UserDoesNotExistException;
import com.adi.ecommerce.user.user.Exception.UserNeedToLoginException;
import com.adi.ecommerce.user.user.Exception.UserPasswordDoesntMatchException;

import java.util.Optional;

public interface UserService {
    boolean RegisterUser(User user) throws UserAlreadyExistException;

    User LoginUser(String email, String password) throws UserDoesNotExistException, UserPasswordDoesntMatchException;

    boolean LogoutUser(User user) throws UserNeedToLoginException;
}
