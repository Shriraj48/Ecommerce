package com.adi.ecommerce.user.user.Entity;
import java.util.UUID;

public class User {
    private String userId;
    private String userEmail;
    private String userPassword;
    private String userToken;

    public User(String userEmail, String userPassword) {
        this.userId = "USER_" + UUID.randomUUID();
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public User() {

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userToken='" + userToken + '\'' +
                '}';
    }
}
