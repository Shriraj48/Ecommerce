package com.shriraj.ecommerce.customer.model;

public class Customer {
private static int count = 1; 
	private int customerId;
	private String customerPassword;
	private double customerCredit;
	private String customerEmail;
	
	
	public Customer() {
		
	}
	
	
	    
	    
	public Customer(String customerEmail, String customerPassword, double customerCredit) {
	    this.customerEmail = customerEmail;
	    this.customerPassword = customerPassword;
	    this.customerId = count++;
	    this.customerCredit = customerCredit; 
	}
	
	public void setPassword(String customerPassword){
	     this.customerPassword = customerPassword;
	}
	
	public void setCredit(double customerCredit){
	     this.customerCredit = customerCredit;
	}
	
	public void setEmail(String customerEmail){
	     this.customerEmail = customerEmail;
	}
	
	
	
	public String getPassword(){
	    return customerPassword;
	}
	
	public double getCredit(){
	     return customerCredit;
	}
	
	public String getEmail(){
	     return customerEmail;
	}
	
	 public int getCustomerId() {
	        return customerId;
	    }
	 
	 @Override
	 public String toString() {
	     return "Customer{" +
	             "email='" + customerEmail + '\'' +
	             ", password='" + customerPassword + '\'' +
	             ", credit=' " + customerCredit + '\'' +
	             '}';
	 }

}
