//Simon Chong Kai Yuen A19EC3028
//Clive Lai Yi Cheng A19EC3019

import java.util.Scanner;

public class sumUpDigit {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String sNum;
		char cNum;
		int iNum = 0, sum = 0;

		System.out.println("Plese insert a series of integer single digit number");
		sNum = input.next();
		//System.out.println(sNum.length());
		for (int i=0; i<sNum.length(); i++){
			cNum = sNum.charAt(i);
			iNum = Integer.parseInt(String.valueOf(cNum));
			sum += iNum;
			System.out.println("--------"+iNum);
		}

		System.out.println("Sum of " + sNum + " is : " + sum);
	}
}
