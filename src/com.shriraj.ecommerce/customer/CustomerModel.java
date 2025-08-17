public class CustomerModel {
private static int count = 1; 
	private String customerPassword;
	private double customerCredit;
	private String customerEmail;
	
	public CustomerModel(String email, String customerPassword) {
	    this.email = email;
	    this.customerPassword = customerPassword;
	    this.credit = 100000; // default value
	}
	
	
	
	public void setPassword(String customerPassword){
	     this.customerPassword = customerPassword;
	}
	
	public void setCredit(double credit){
	     this.credit = credit;
	}
	
	public void setEmail(String email){
	     this.email = email;
	}
	
	public String getPassword(){
	    return customerPassword;
	}
	
	public double getCredit(){
	     return credit;
	}
	
	public String getEmail(){
	     return email;
	}
}
