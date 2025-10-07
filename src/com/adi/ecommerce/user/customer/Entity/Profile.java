package com.adi.ecommerce.user.customer.Entity;

public class Profile {
    private String userName;
    private float age;
    private String Address;

    public Profile(float age, String address, String userName) {
        this.age = age;
        Address = address;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", Address='" + Address + '\'' +
                '}';
    }
}
