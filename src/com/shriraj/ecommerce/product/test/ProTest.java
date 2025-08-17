package com.shriraj.ecommerce.product.test;

import com.shriraj.ecommerce.product.DAO.ProductDAO;
import com.shriraj.ecommerce.product.model.ProductModel;

public class ProTest {

	
	
	  public static void main(String[] args) {
		  ProductDAO p1 = new ProductDAO();
		  ProductDAO p2 = new ProductDAO();
		  ProductDAO p3 = new ProductDAO();
		  ProductDAO p4 = new ProductDAO();
		  
	p1.addProduct(new ProductModel(101, 499.99, 50));
	p2.addProduct(new ProductModel(102, 500.00, 50));
	p3.addProduct(new ProductModel(103, 200.00, 50));
	p4.addProduct(new ProductModel(104, 599.99, 50));
	
	System.out.println(p1.getProductByNumber(101));
	
	System.out.println(p1.isProductInStock(101));
	
	System.out.println(p1.updateProductInStock(101,25));
	
	System.out.println(p1.getProductByNumber(101));
	
	p1.deleteProduct(102);
	
	System.out.println(p1.getProductByNumber(101));
	
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
