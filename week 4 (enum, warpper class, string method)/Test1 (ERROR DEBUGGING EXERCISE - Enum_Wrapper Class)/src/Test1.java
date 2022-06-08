import java.util.Scanner;
import javax.swing.JOptionPane;

public class Test1
{
   private static int count;
   enum Day {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};

   public static void main (String [] arg)
   {
      double price = 0;
      String str;
      Integer obj1;
      int num2, birthyear = 1996;

      Scanner keyboard = new Scanner(System.in);
      Circle c = new Circle(12.5);

      System.out.print("Enter a number: ");
      count = keyboard.nextInt();
      Test.displayNumber(count);
      System.out.printf("The area of circle = %.2f\n",c.findArea());

      JOptionPane.showMessageDialog(null, "Welcome to Student Mart");
      str = JOptionPane.showInputDialog("Enter the retail price (RM) ");
      price = Double.parseDouble(str);
      System.out.printf("The price before discount = RM%.2f\n", price);
      System.out.printf("The price after discount = RM%.2f\n", price * 0.90);

      obj1 = birthyear;
      System.out.println("You were born in year: " + obj1);
      Integer obj2 = 2015;
      num2 = obj2;
      System.out.println("Now, you are in year: " + num2);
      System.out.println("Now, your age: " + (num2 - obj1) + " years old\n");
   }
}

class Test
{
   public static double squareMethod(int i)
   {
      return i * i;
   }

   public static void displayNumber(int i)
   {
      int number = i;
      System.out.println("The square of " + number + " = " + squareMethod(number));
   }
}

class Circle
{
   private double radius, area;
   final double PI = 3.14159;

   Circle (double r)
   {
     radius = r;
   }

   public double findArea()
   {
      area = radius * radius * PI;
      return area;
   }
}