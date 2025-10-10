package com.adi.ecommerce.user.customer.Entity;

import com.adi.ecommerce.user.user.Entity.User;

public class Customer extends User {
    private double customerCredit;
    private Profile customerProfile;

    public Customer() {
        super();
    }

    public Customer(String userEmail, String userPassword, double customerCredit, Profile customerProfile) {
        super(userEmail, userPassword);
        this.customerCredit = customerCredit;
        this.customerProfile = customerProfile;
    }

    public double getCustomerCredit() {
        return customerCredit;
    }

    public void setCustomerCredit(double customerCredit) {
        this.customerCredit = customerCredit;
    }

    public Profile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(Profile customerProfile) {
        this.customerProfile = customerProfile;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userId='" + getUserId() + '\'' +
                ", userEmail='" + getUserEmail() + '\'' +
                ", userPassword='" + getUserPassword() + '\'' +
                ", userToken='" + getUserToken() + '\'' +
                "customerCredit=" + customerCredit +
                ", customerProfile=" + customerProfile +
                '}';
    }
}
