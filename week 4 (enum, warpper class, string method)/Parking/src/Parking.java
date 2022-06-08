import java.util.Scanner;

public enum Parking{
	MOTORCYCLE (1, 1.00),
	SEDAN_CAR (2, 2.00),
	MPV_CAR (3, 3.00),
	VAN (4, 3.00);

	private int num;
	private double price;

	Parking(int n, double p){
		num = n;
		price = p;
	}

	public double payment(int hour){
		return price*hour;
	}

	public static void main(String[] args) {
		for(Parking park : Parking.values()){
			System.out.println(park.num + ". " + park);
		}
		System.out.print("\nEnter the choice: ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		Parking p[] = Parking.values();
		for(Parking park : p){
			if(choice == park.num){
				System.out.println(park + " RM " + park.price + " per hour\n");
				System.out.print("\nEnter parking hours: ");
				System.out.printf("TOTAL PAYMENT: RM%.2f", park.payment(input.nextInt()));
				System.out.println();
			}
		}
	}
} 