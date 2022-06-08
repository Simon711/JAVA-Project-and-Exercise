import java.util.Scanner;

public class MonthlyBill {
    public static void main(String[] args){

	double hours = 0;
	double fee = 0;

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter the letter of the package type(A,B,C,or D): ");
	char package_type = input.next().charAt(0);
	package_type = Character.toUpperCase(package_type);

	switch(package_type){
            case 'A':
            System.out.print("Please enter the number of hours that were used: ");
            hours = input.nextDouble();
            if (hours <= 10)
            	fee = 10;
            else
            	fee = 10 + ((hours - 10) * 2);
            System.out.println("Your monthly fee is RM " + fee);
            break;

            case 'B':
            System.out.print("Please enter the number of hours that were used: ");
            hours = input.nextDouble();
            if (hours <= 20)
            	fee = 20;
            else
            	fee = 20 + ((hours - 20) * 1.5);
            System.out.println("Your monthly fee is RM " + fee);
            break;

            case 'C':
            System.out.print("Please enter the number of hours that were used: ");
            hours = input.nextDouble();
            if (hours <= 30)
            	fee = 30;
            else
            	fee = 30 + ((hours - 30) * 1);
            System.out.println("Your monthly fee is RM " + fee);
            break;

            case 'D':
            System.out.print("Please enter the number of hours that were used: ");
            hours = input.nextDouble();
            if (hours <= 50)
            	fee = 50;
            else
            	fee = 50 + ((hours - 50) * 0.5);
            System.out.println("Your monthly fee is RM " + fee);
            break;

            default:
            System.out.println("Invalid Input! Please input A, B, C or D ");
            break;
        }
    }
}