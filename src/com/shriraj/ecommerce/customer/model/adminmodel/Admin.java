package com.shriraj.ecommerce.customer.model.adminmodel;

public class AdminModel {
		private static int count = 1; 
		private int userId;
		protected String customerPassword;
		protected String customerEmail;
		
		public AdminModel() {
		}
		   
		public AdminModel(String customerEmail, String customerPassword, int userId) {
		    this.customerEmail = customerEmail;
		    this.customerPassword = customerPassword;
		    this.userId = count++;   
		}
		
		 public static int getCount() {
			return count;
		}

		public static void setCount(int count) {
			AdminModel.count = count;
		}

		public int getAdminId() {
			return userId;
		}

		public void setAdminId(int userId) {
			userId = userId;
		}

		public String getCustomerPassword() {
			return customerPassword;
		}

		public void setCustomerPassword(String customerPassword) {
			this.customerPassword = customerPassword;
		}

		public String getCustomerEmail() {
			return customerEmail;
		}

		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}

		@Override
		 public String toString() {
		     return "Customer{" +
		    		 "Id='" + userId + '\'' +
		             "email='" + customerEmail + '\'' +
		             ", password='" + customerPassword + '\'' +
		             ", credit=' " + buyerCredit + '\'' +
		             '}';
		 }

	}

