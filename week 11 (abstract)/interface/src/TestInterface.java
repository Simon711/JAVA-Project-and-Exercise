//a)define interface Discount
interface Discount{
	double RATE = 0.10; 
	double calcDiscount();
}

//b) Define class header for UTM_Member
abstract class UTM_Member
{
	private String name;
	private String id;
	private double amountDue;
	
	public UTM_Member(String name, String id, double amountDue)
	{
		this.name = name;
		this.id = id;
		this.amountDue=amountDue;
	 }
	
	 public String getName()
	 {
		 return name;
	 }
	 
	 public String getId()
	 { 
		 return id; 
	 }
	
	 public double getAmount()
	 {
		 return amountDue; 
	 }
	 
//c)declare an abstract  method displayInfo()
	 abstract void displayInfo();
}//end of class UTM_Member


// d)define class Student with attributes & constructor
 class Student extends UTM_Member implements Discount{
	 
	 private String course;
	 
	 Student(String n, String i, double a, String c){
		 super(n, i, a);
		 course = c;
	 }
	 
	 public String getCourse()
	 {   
		 return course; 
	 }
	 
	 public double calcDiscount()
	 {  
		 double discAmount = getAmount()*RATE;
		 return discAmount;
	 }
	
	 public void displayInfo()
	 {
	 System.out.println ("Student Name: "+ getName());
	 System.out.println ("Student ID : "+ getId());
	 System.out.println ("Course : "+ getCourse());
	 System.out.println ("Amount Due: RM"+ getAmount());
	 System.out.printf ("Total price after discount : RM %.2f \n", (getAmount()- calcDiscount()));
	 }
 } //end of class Student

// define class TestInterface with main () create object & invoke appropriate method

public class TestInterface {

	public static void main(String[] args) {
		Student stu = new Student("Simon", "A19EC3028", 30, "SECV");
		stu.displayInfo();
	}

}
