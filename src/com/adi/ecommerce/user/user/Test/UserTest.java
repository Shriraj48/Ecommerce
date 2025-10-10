package com.adi.ecommerce.user.user.Test;

import com.adi.ecommerce.user.user.DAO.InMemoryUserDAO;
import com.adi.ecommerce.user.user.Entity.User;
import com.adi.ecommerce.user.user.Service.UserService;
import com.adi.ecommerce.user.user.Service.UserServiceImpl;

import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl(new InMemoryUserDAO(new ArrayList<>()));
        User userToRegister1 = new User("aditya.com","adi");
        User userToRegister2 = new User("shriraj.com","shri");

        try {
            userService.RegisterUser(userToRegister1);
            System.out.println("✅ Registered: " + userToRegister1);
            userService.RegisterUser(userToRegister2);
            System.out.println("✅ Registered: " + userToRegister2);
        } catch (Exception e) {
            System.err.println("❌ Registration failed: " + e.getMessage());
        }

        try {
            User userLogged1 = userService.LoginUser("aditya.com","adi");
            System.out.println("🔓 Login successful for: " + userLogged1);
            User userLogged2 = userService.LoginUser("shriraj.com","shrio"); // ikde password barobar takun bagh
            System.out.println("🔓 Login successful for: " + userLogged2);
        } catch (Exception e) {
            System.err.println("❌ Login failed: " + e.getMessage());
        }

        try {
            userService.LogoutUser(userToRegister1);
            System.out.println("🔒 Logout successful for: " + userToRegister1);
            userService.LogoutUser(userToRegister2);
            System.out.println("🔒 Logout successful for: " + userToRegister2);
        } catch (Exception e) {
            System.err.println("❌ Logout failed: " + e.getMessage());
        }
    }
}
