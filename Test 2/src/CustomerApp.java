import java.util.*;

public class CustomerApp {
	public static void displayMenu() {
		System.out.println("------------------------------------------");
		System.out.println("      Pizza Delivery Ordering System");
		System.out.println("------------------------------------------");
		System.out.println("[1] Add Customer");
		System.out.println("[2] Display Customers");
		System.out.println("[3] Exit");
		System.out.print("Your choice: ");
	}
	
	public static void main(String[] args) {
		
		Vector<Customer> cust = new Vector<Customer>();
		Address add;
		Customer customer;
		Pizza pizz;
		
		
		Scanner input = new Scanner(System.in);	
		displayMenu();
		
		int choice =  input.nextInt();
		
		String f_name = input.nextLine();
		String l_name = input.nextLine();
		String street = input.nextLine();
		String city = input.nextLine();
		String pay_mode = input.nextLine();
		int num_pizza = input.nextInt();
		String desc = input.nextLine();
		String size = input.nextLine();
		
		if(choice == 1) {
			System.out.println("***** Add Customer *****");
			System.out.println("First name: " + f_name);
			System.out.println("Last name: " + l_name);
			System.out.println("Address: ");
			System.out.println("\tStreet: " + street);
			System.out.println("\t" + city);
			System.out.println("Payment Mode [Online | COD]: " + pay_mode);
			System.out.println("Number of pizzas" + num_pizza);
			
			add = new Address(street, city);
			customer = new Customer(pay_mode, add, f_name, l_name);
			cust.addElement(customer);
			
			for(int i=0; i<num_pizza; i++) {
				System.out.println("\tPizza #" + i);
				System.out.println("\t\tDescription: " + desc);
				System.out.println("\t\tSize [S-Small, R-Regular, L-Large]: " + size);
				pizz = new Pizza(desc, size);
				customer.order(pizz);
			}
		}
		
		else if(choice == 2) {
			System.out.println("***** Add Customer *****");
			
			for(int i=0; i<cust.size(); i++) {
				System.out.println("Customer #" + i);
				System.out.println("Address: "); 
				cust.get(i).display();
			}
		}
		
		else if(choice == 3) {
			System.out.println("Thank you for using this system :)");
		}		
}

}	