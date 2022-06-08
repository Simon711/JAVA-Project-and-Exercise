import java.util.Scanner;

public class Carpet {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		String brandName;
		double length, width, area;

		System.out.print("Enter the carpet brand:");
		brandName = input.nextLine();

		System.out.print("Enter the carpet length:");
		length = input.nextDouble();

		System.out.print("Enter the carpet width:");
		width = input.nextDouble();

		area = width*length;

		System.out.print("The area of carpet of " + length + " x " + width);
		System.out.printf(" is RM%.0f%n", area);
		}
}
