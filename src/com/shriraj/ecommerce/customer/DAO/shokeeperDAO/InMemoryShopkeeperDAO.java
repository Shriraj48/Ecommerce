package com.shriraj.ecommerce.customer.DAO.sellerDAO;

import java.util.List;
import com.shriraj.ecommerce.customer.DAO.buyerDAO.CustomerDAO;
import com.shriraj.ecommerce.customer.DAOuserDAO.InMemoryUserDAO;
import com.shriraj.ecommerce.customer.model.buyermodel.Customer;
import com.shriraj.ecommerce.customer.model.sellermodel.ShopKeeper;
import com.shriraj.ecommerce.product.DAO.ProductDAO;
import com.shriraj.ecommerce.product.model.ProductModel;

public class InMemoryShopkeeperDAO extends InMemoryUserDAO implements ShopkeeperDAO{
	private List<ShopKeeper> shopkeeperList;
	private CustomerDAO customer;
	private ProductDAO product;


	public InMemoryShopkeeperDAO() {
		
	}
	
	public InMemoryShopkeeperDAO(CustomerDAO customer, List<ShopKeeper> shopkeeperList, ProductDAO product) {
		super(customer, null, null);
		this.shopkeeperList = shopkeeperList;
		this.product = product;
	}

	List<Customer> customerList = customer.getAllCustomers();	
	List<ProductModel> productList = product.getAllAvailableProducts();


	
	public List<ShopKeeper> getAllShopkeepers(){
		return shopkeeperList;
	}

	@Override
	public double getCredit(String emailId) {
		for(ShopKeeper s : shopkeeperList) {
			if(s.getEmail()==(emailId)) {
			for(ProductModel p : productList) {
				s.setShopCredit(s.getShopCredit()+p.getProductPrice())  ;
				}		
			}
		}
		return 0;
	}

	@Override
	public void getShopOrder() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
}	
	
	
	
	
	
	
