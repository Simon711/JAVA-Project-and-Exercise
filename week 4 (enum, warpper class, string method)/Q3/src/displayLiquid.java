//Simon Chong Kai Yuen A19EC3028
//Clive Lai Yi Cheng A19EC3019

import java.util.Scanner;

class displayLiquid {

	enum Liquid {
		Red("Acidic Substance"), Blue("Basic Material"), Purple("Neutral");

		String message;

		Liquid(String m) {
			message = m;
		}

		public String getMessage(){
			return message;
		}

		public static String color(){
			Scanner input = new Scanner(System.in);
			System.out.println("Please input a color");
			String color = input.next();
			return color;
		}

		public static void gc() {
			Liquid liquid = Enum.valueOf(Liquid.class, color());
			System.out.println("Warning---  " + liquid.getMessage());

		}
}

	public static void main(String[] args) {
		Liquid.gc();
		System.out.println();
		}
}