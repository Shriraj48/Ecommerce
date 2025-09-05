package com.shriraj.ecommerce.product.DAO;

import java.util.ArrayList;
import java.util.List;
import com.shriraj.ecommerce.product.model.ProductModel;


public class InMemoryProduct implements ProductDAO {
	private static List<ProductModel> productList = new ArrayList<>();
	
	public List<ProductModel> getAllAvailableProducts() {
		return productList;
	}
	
	public void addProduct(ProductModel productAdded) {
		productList.add(productAdded);
	}
	
	public ProductModel getProductByNumber(int productNumber){
		for (ProductModel p : productList) {
			if(p.getProductNumber()==(productNumber)) {
				return p;
			}
		}
		return null;
	}
	
	
	public void deleteProduct(int productNumber) {
	    for (int i = 0; i < productList.size(); i++) {
	        if (productList.get(i).getProductNumber() == productNumber) {
	            productList.remove(i); 
	            break; 
	        }
	    }
	}

			
	
	public Integer isProductInStock(int productNumber) {
		for (ProductModel p : productList) {
			if(p.getProductNumber()==(productNumber)) {
				return p.getProductStock();
			}
		}
		return null;
	}
	
	
	public Integer updateProductInStock(int productNumber, int productStock) {
		for (ProductModel p : productList) {
			if(p.getProductNumber()==(productNumber)) {
				p.setProductStock(productStock);
				return p.getProductStock();
			}
		}
		return null;
	}

	
	
	
	
}
	
