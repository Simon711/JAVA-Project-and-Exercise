//Simon

interface Taxable{
	double GasTaxRate = 0.75;
	double MotorVehicleTaxRate = 0.50;
	
	double calcTax();
}

abstract class Product{
	private String description;
	private double price;
	
	public Product(String d, double p){
			description = d;
			price = p;
		}
	
	public double getPrice() {
		return price;
	}
	
	public String getDescription() {
		return description;
	}
	
	abstract void display();
}

class Gasoline extends Product implements Taxable{
	private String type;
	
	public Gasoline(String d,  String t, double p) {
		super(d,p);
		type = t;
	}

	public String getType(){
		return type;
	}
	
	public double calcTax() {
		return getPrice()*GasTaxRate;
	}
	
	public void display(){
		System.out.println("Gasoline" + "\nDescription: " + getDescription() + "\nType: " + getType());
		System.out.printf("Price: RM %.2f \nTotal Tax: RM %.2f \n\n", getPrice(), calcTax());
	}
}

class MotorVehicle extends Product implements Taxable{
	private String MotorType;
	
	public MotorVehicle(String d, String m, double p) {
		super(d,p);
		MotorType = m;
	}
	
	public String getMotorType(){
		return MotorType;
	}
	
	public double calcTax() {
		return getPrice()*MotorVehicleTaxRate;
	}
	
	public void display(){
		System.out.println("Motor Vehicle" + "\nDescription: " + getDescription() + "\nType: " + getMotorType());
		System.out.printf("Price: RM %.2f \nTotal Tax: RM %.2f \n\n", getPrice(), calcTax());
	}
}

class Food extends Product{
	private int calories;
	
	public Food(String d, double p, int c) {
		super(d,p);
		calories = c;
	}
	
	public int getCalory() {
		return calories;
	}
	
	public void display(){
		System.out.println("Food" + "\nDescription: " + getDescription());
		System.out.printf("Price: %.2f  \nTotal Calories: %d \n\n", getPrice(), getCalory());
	}
}

public class TestProduct {

	public static void main(String[] args) {
		Product inventory[] = new Product[4];
		
		inventory[0] = new Food("Meat", 14.40, 2000);
		inventory[1] = new Food("Banana", 1.50, 500);
		inventory[2] = new MotorVehicle("Proton", "Car", 56000);
		inventory[3] = new Gasoline("Unleaded", "Diesel", 2.50);
		
		for(int i=0; i<inventory.length; i++) {
			inventory[i].display();
		}	
		
		//or
		for(Product pro : inventory) {
			pro.display();
		}
		
	}
}
