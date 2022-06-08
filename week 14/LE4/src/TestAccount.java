//Simon

import java.util.Scanner;
import java.lang.*;

interface Profit{
	double HIBAH_RATE = 0.02;
	public double calcHibah();
}


abstract class Account{
	protected String accNo;
	protected double balance;
	
	Account(){
		accNo = "";
		balance = 0;
	}
	
	Account(String a, double b){
		accNo = a;
		balance = b;
	}
	
	public abstract void displayReport();
	
	public void deposit(double d) {
		balance = balance + d;
	}
	
	public void withdraw(double w) {
		if((balance-w)<0)
			System.out.println("Insufficient Amount");
		else
			balance = balance - w;
	}
	
	public double getBalance() {
		return balance;
	}
}


class Savings extends Account implements Profit{
	private String accName;
	
	Savings(String a) {
		super("001", 2000.00);
		accName = a;
	}
	
	public double calcHibah() {
		return balance*HIBAH_RATE;
	}
	
	public void displayReport() {
		System.out.println("Monthly Hibah Earned: " + calcHibah());
		System.out.println("Ending Balance: RM" + (balance + calcHibah()));
	}
}


public class TestAccount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		Savings saving = new Savings("Ahmad");
		
		do {
			System.out.print("*".repeat(8));
			System.out.print(" BANK ACCOUNT MENU ");
			System.out.println("*".repeat(8));
			System.out.println("\n1. Saving Account Deposit");
			System.out.println("2. Saving Account Withdrawal");
			System.out.println("3. Display Report");
			System.out.println("4. Exit");
			System.out.print("\nPleace enter your choice 1-4: ");
			
		int choice = input.nextInt();
		System.out.println();;
		switch(choice) {
		case 1:
			System.out.print("Enter amount to deposit: ");
			double deposit = input.nextDouble();
			System.out.println("Please insert your cash.");
			System.out.println("Deposit Accepted");
			saving.deposit(deposit);
			System.out.println("Your current balance is RM" + saving.getBalance());
			System.out.println();
			break;

		case 2:
			System.out.print("Enter amount to withdraw: ");
			double withdraw = input.nextDouble();
			System.out.println("Please take your cash.");
			saving.withdraw(withdraw);
			System.out.println("Your current balance is RM" + saving.getBalance());
			System.out.println();
			break;

		case 3:
			saving.displayReport();
			System.out.println();
			break;

		case 4:
			return;
		}
		
		}while(true);
	
	}
}
