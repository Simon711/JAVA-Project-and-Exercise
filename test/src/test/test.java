package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Orchid implements Flower{
	public Orchid() {
		this("White");
		System.out.println("Default constuctor for Orchid");
	}
	
	public Orchid(String s) {
		System.out.println("Constructor with argument for " + s + " Orchid");
		
	}
	public void display() {
		System.out.println("Display in Orchid");
	}
}

class Lily extends Orchid{
	public Lily() {
		System.out.println("Default constructor for Lily");
	}
}

class Daisy extends Orchid implements Flower{
	public Daisy() {
		super("Red");
		System.out.println("Default constructor for Daisy");
	}
	
	public Daisy(String s) {
		super();
		System.out.println("Constructor with argument for " + s + " Daisy");
	}
	public void display() {
		super.display();
		System.out.println("Display in Daisy");
	}
}
interface Flower{
	public void display();
}

public class test{
public static void main(String [] a) {

//	Daisy ob = new Daisy();
//	   ob.display(); 
//
//	Orchid ob = new Daisy("Yellow");
//    ob.display(); 

    Orchid ob = new Lily();
    ob.display(); 
	
	}
}
