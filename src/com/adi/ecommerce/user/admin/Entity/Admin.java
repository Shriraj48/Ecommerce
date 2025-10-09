package com.adi.ecommerce.user.admin.Entity;

import com.adi.ecommerce.user.user.Entity.User;

public class Admin extends User {
    public Admin(String adminEmail, String adminPassword) {
        super(adminEmail, adminPassword);
    }
}
