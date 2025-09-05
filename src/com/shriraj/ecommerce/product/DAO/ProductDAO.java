package com.shriraj.ecommerce.product.DAO;

import java.util.List;

import com.shriraj.ecommerce.product.model.ProductModel;

public interface ProductDAO {
	 List<ProductModel> getAllAvailableProducts(); 
	
	 void addProduct(ProductModel productAdded); 
	
	 ProductModel getProductByNumber(int productNumber);
	
	
	 void deleteProduct(int productNumber);

			
	
	 Integer isProductInStock(int productNumber);
	
	
	 Integer updateProductInStock(int productNumber, int productStock); 
}
