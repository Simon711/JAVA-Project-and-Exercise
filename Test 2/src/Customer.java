import java.util.*;

public class Customer {
	private String paymentMode;
	private Name name;
	private Address Address;
	private Vector<Pizza> pizzaList;
	final private double  DELIVERY_CHARGE = 5;
	
	public Customer(String p, Address add, String f, String l){
		paymentMode = p;
		Address = add;
		name = new Name(f,l);
		pizzaList = new Vector<Pizza>();
	}
	
	public void order(Pizza pizza) {
		pizzaList.addElement(pizza);
	}
	
	public void display() {
		System.out.println("Name" + name);
		System.out.println("Address" + Address.toString());
		System.out.println("Number of ordered pizza:" + pizzaList.size());
		for (int i=0; i<pizzaList.size();i++) {
			System.out.printf("%d %s %s", i , ")" ,pizzaList.get(i).getDescription() , pizzaList.get(i).getPizzaSize());
			
		}
		if(paymentMode=="Online") {
			for (int i=0; i<pizzaList.size();i++) {
			  pizzaList.get(i);
		 }
		}
		
	}
}

