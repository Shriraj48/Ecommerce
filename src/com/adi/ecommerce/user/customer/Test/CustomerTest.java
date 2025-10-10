package com.adi.ecommerce.user.customer.Test;

import com.adi.ecommerce.user.customer.DAO.InMemoryCustomerDAO;
import com.adi.ecommerce.user.customer.Entity.Customer;
import com.adi.ecommerce.user.customer.Entity.Profile;
import com.adi.ecommerce.user.customer.Service.CustomerService;
import com.adi.ecommerce.user.customer.Service.CustomerServiceImpl;
import com.adi.ecommerce.user.user.Entity.User;
import com.adi.ecommerce.user.user.Exception.UserDoesNotExistException;
import com.adi.ecommerce.user.user.Exception.UserPasswordDoesntMatchException;

import java.util.ArrayList;
import java.util.Optional;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer1 = new Customer("aditya.com", "adi", 100, new Profile(22, "Juinagar", "Adiking"));
        CustomerService customerService = new CustomerServiceImpl(new InMemoryCustomerDAO(new ArrayList<>()));

        // 1. Register user
        try {
            customerService.RegisterUser(customer1);
            System.out.println("✅ Registered: " + customer1);
        } catch (Exception e) {
            System.err.println("❌ Registration failed: " + e.getMessage());
        }

        // 2. Login user
        try {
            Optional<User> loggedIn = Optional.ofNullable(customerService.LoginUser("aditya.com", "adi"));
            if (loggedIn.isPresent()) {
                System.out.println("🔓 Login successful for: " + customer1);
            } else {
                System.out.println("❌ Login failed: wrong password");
            }
        } catch (UserDoesNotExistException | UserPasswordDoesntMatchException e) {
            System.err.println("❌ Login failed: " + e.getMessage());
        }

        // 3. Update customer credit
        try {
            boolean creditUpdated = customerService.updateCustomerCredit(customer1.getUserId(), 150.0);
            System.out.println("💰 Credit updated: " + creditUpdated);
        } catch (UserDoesNotExistException e) {
            System.err.println("❌ Credit update failed: " + e.getMessage());
        }

        // 4. Get customer credit
        Optional<Double> credit = customerService.getCustomerCredit(customer1.getUserId());
        credit.ifPresentOrElse(
                c -> System.out.println("💳 Current credit: " + c),
                () -> System.out.println("❌ No credit found")
        );

        // 5. Update customer profile
        try {
            Profile newProfile = new Profile(23, "Nerul", "AdiKingUpdated");
            boolean profileUpdated = customerService.updateCustomerProfile(customer1.getUserId(), newProfile);
            System.out.println("📝 Profile updated: " + profileUpdated);
        } catch (UserDoesNotExistException e) {
            System.err.println("❌ Profile update failed: " + e.getMessage());
        }

        // 6. Get customer profile
        Optional<Profile> profile = customerService.getCustomerProfile(customer1.getUserId());
        profile.ifPresentOrElse(
                p -> System.out.println("👤 Current profile: " + p),
                () -> System.out.println("❌ No profile found")
        );

        // 7. Logout user (LAST)
        try {
            customerService.LogoutUser(customer1);
            System.out.println("🔒 Logout successful for: " + customer1);
        } catch (Exception e) {
            System.err.println("❌ Logout failed: " + e.getMessage());
        }
    }
}
