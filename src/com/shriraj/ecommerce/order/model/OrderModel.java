package com.shriraj.ecommerce.order.model;

import java.time.LocalDate;

public class OrderModel {
    private int orderNumber;
    private LocalDate orderDate;

    public OrderModel() {
    	
    }
    
    public OrderModel(int orderNumber, LocalDate orderDate) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
    }

   
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "OrderModel{" +
                "orderNumber=" + orderNumber +
                ", orderDate=" + orderDate +
                '}';
    }
}

