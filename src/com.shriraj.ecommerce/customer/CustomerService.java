import java.util.Scanner;

public class CustomerService {
//	private List<Customer> c = new ArrayList<>(); not to do this bcz we have to stored this in storage layer
	private Scanner sc = new Scanner(System.in);

	//Register
	public void registerCustomer() {
		System.out.println("Enter Email id :");
		String email = sc.nextLine();
		System.out.println("Enter password :");
		String customerPassword = sc.nextLine();
		c.add(new CustomerModel(email,  customerPassword)); 	
	}
	
	//login
	public void loginCustomer() {
		System.out.println("Enter Email id :");
		String emailId = sc.nextLine();
		System.out.println("Enter Password :");
		String password = sc.nextLine();
		
		for (CustomerModel user : c) {
			if(user.getEmail()==(emailId) && user.getPassword()==(password)) {
				System.out.println("Valid info");
			}else {
	            System.out.println("Invalid info");
	            return; 
	        }
	    }

	    System.out.println("No users registered"); 
	}
	
	//Forgot
	public void forgotCustomer() {
		System.out.print("Email ID:");
		String emailId = sc.nextLine();
		for (CustomerModel user : c) {
			if(user.getEmail().equals(emailId)) {
				System.out.println("Valid info");
				System.out.println("Enter new password");
				user.setPassword(sc.nextLine());
				System.out.println("Changed successfully");
			}else {
				System.out.println("wrong password");
			}
		   }	
	      } 
}
