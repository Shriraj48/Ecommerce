package com.shriraj.ecommerce.order.test;

import java.util.List;
import java.util.Scanner;

import com.shriraj.ecommerce.customer.DAO.adminDAO.CustomerDAO;
import com.shriraj.ecommerce.customer.model.buyermodel.Customer;
import com.shriraj.ecommerce.customer.service.CustomerService;
import com.shriraj.ecommerce.customer.test.CustomerTest;
import com.shriraj.ecommerce.order.service.OrderService;
import com.shriraj.ecommerce.product.DAO.ProductDAO;
import com.shriraj.ecommerce.product.model.ProductModel;

import java.util.Scanner;
//
//public class OrderTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        OrderService s1 = new OrderService();
//        CustomerService cs = new CustomerService();
//        CustomerDAO c = new CustomerDAO();
//        ProductModel p = new ProductModel();
//        ProductDAO p1 = new ProductDAO();
//        ProductDAO p2 = new ProductDAO();
//        ProductDAO p3 = new ProductDAO();
//        ProductDAO p4 = new ProductDAO();
//        
//        p1.addProduct(new ProductModel(101, 499.99, 50));
//    	p2.addProduct(new ProductModel(102, 500.00, 50));
//    	p3.addProduct(new ProductModel(103, 200.00, 50));
//    	p4.addProduct(new ProductModel(104, 599.99, 50));
//
//        while (true) {
//            System.out.println("\nUser Management System");
//            System.out.println("1. Register");
//            System.out.println("2. Login");
//            System.out.println("3. Show Customer");
//            System.out.println("4. Show Product");
//            System.out.println("5. Place Order");
//            System.out.println("6. Exit");
//            System.out.print("Enter your choice: ");
//            int choice = sc.nextInt();
//            sc.nextLine(); 
//
//            switch (choice) {
//                case 1:
//                	System.out.print("If You Not Register ");
//                    System.out.print("Enter customer email: ");
//                    String email = sc.nextLine();
//                    System.out.print("Enter customer password: ");
//                    String password = sc.nextLine();
//                    cs.registerCustomer(email, password);
//                    
////                    break;
//
//                case 2:
//                	System.out.print("Login Now");
//                    System.out.print("Enter email: ");
//                    String loginEmail = sc.nextLine();
//                    System.out.print("Enter password: ");
//                    String loginPassword = sc.nextLine();
//                    Customer log = cs.loginCustomer(loginEmail, loginPassword);
//            		if (log != null) {
//            		    System.out.println("Successfully login");
//            		    System.out.println(log);
//            		} else {
//            		    System.out.println("Login failed: Invalid email or password.");
//            		}
////                    break;
//                    
//                case 3:
//                    System.out.println("Available Customers:");
//                    List<Customer> customer = c.getAllCustomers();
//                    if (customer == null || customer.isEmpty()) {
//                        System.out.println("Customers are not available");
//                    } else {
//                        System.out.println(customer);
//                    }
////                    break;
//                	
//
//                case 4:
//                    System.out.println("Available products:");
//                    List<ProductModel> product = p1.getAllAvailableProducts();
//                    if(product != null) {
//                    	System.out.println(product);
//                    }else {
//                    	System.out.println("Product are not available");
//                    }
//                    
////                    break;
//
//                case 5:
//                	System.out.print("Placed Your Order Now ");
//                    System.out.print("Enter your email ID: ");
//                    String orderEmail = sc.nextLine();
//                    System.out.print("Enter product number: ");
//                    int productNumber = sc.nextInt();
//                    System.out.print("Enter quantity: ");
//                    int productStock = sc.nextInt();
//                    sc.nextLine(); 
//                   s1.placeOrder(orderEmail, productNumber, productStock); 
//                    
//                    break;
//
//                case 6:
//                    System.out.println("Exiting...");
//                    sc.close();
//                    return; 
//
//                default:
//                    System.out.println("Invalid choice. Please select 1–6.");
//            }
//        }
//    }
//}

