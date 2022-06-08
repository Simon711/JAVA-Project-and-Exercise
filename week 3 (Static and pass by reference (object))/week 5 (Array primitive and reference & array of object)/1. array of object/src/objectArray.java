import java.util.Scanner;

class Student {
	private String name;
	private double gpa;
	
	public Student() {
		name = "";
		gpa = 0.0;
	}
	
	public Student (String n, double g) {
		name = n;
		gpa = g;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double g) {
		gpa = g;
	}
	
	public void display() {
		System.out.println("Name: " + name + "\tGpa: " + gpa + "\n");
	}
}

public class objectArray{
	public static void main (String[] args) {
		Student [] student = new Student[2];
		
		Scanner input = new Scanner(System.in);
		
		for (int i=0; i<student.length; i++) {
			student[i] = new Student();
			System.out.println("Insert student name");
			String name = input.nextLine();
			System.out.println("Insert student GPA");
			double gpa = input.nextDouble();
			student[i].setName(name);
			student[i].setGpa(gpa);
			input.nextLine();
		}
		
		for (Student stu:student) {
			stu.display();
		}
	}
}