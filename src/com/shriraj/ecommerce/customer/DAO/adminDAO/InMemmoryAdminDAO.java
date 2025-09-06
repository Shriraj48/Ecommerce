package com.shriraj.ecommerce.customer.DAO.adminDAO;
import java.util.ArrayList;
import java.util.List;
import com.shriraj.ecommerce.customer.model.adminmodel.AdminModel;



public class InMemmoryAdminDAO implements AdminDAO{
	
	private List<AdminModel> adminList;
	
//	public InMemoryCustomerDAO(List<Customer> customerList) {
//		this.customerList = customerList;
//	}
	
	public InMemmoryAdminDAO() {
		this.adminList = new ArrayList<>();
	}

	
//private static List<Customer> customerList = new ArrayList<>(); 
	
	public List<AdminModel> getAllAdmins(){
		return adminList;
	}
	
	public List<String> getAllAdminsEmailId(){ 
		List<String> emailList = new ArrayList<>();
		for(AdminModel c : adminList) {
			emailList.add(c.getCustomerEmail());
		} 
		return emailList;
	}
	
	public AdminModel getAdminsByEmailId(String emailId) {
		for(AdminModel c : adminList) {
			if(c.getCustomerEmail().equals(emailId)) {
				return c;
			}	
		}
		return null;
	}
	
	public void addAdmin(AdminModel customerToBeAdded) {
		adminList.add(customerToBeAdded);
	}
	
	public void deleteAdmin(AdminModel customerToBeAdded) {
		adminList.remove(customerToBeAdded);
	}
}

