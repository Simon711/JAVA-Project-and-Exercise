import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Student{
	private String name;
	private int age;
	private String status;
	
	Student(String n, int a, String s){
		name=n;
		age=a;
		status=s;
	}
	
	public void setName(String n) {
		name=n;
	}
	
	public void setAge(int a) {
		age=a;
	}
	
	public void setStatus(String s) {
		status=s;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String toString() {
		return String.format("%-13s %-5d %-15s", name, age, status);
	}
}

public class TestStudent {

	public static void main(String[] args) throws FileNotFoundException {
		
		int counter = 0;
		int counter2 = 0;
		
		ArrayList<Object> stuList = new ArrayList<Object>(); //or <Object>
		
		File file = new File("data.txt");
		Scanner inputFile= new Scanner(file);

		//ystem.out.println(file);
		while (inputFile.hasNext()) {
		   
			String n = inputFile.next();
		    int a = inputFile.nextInt();
		    String s = inputFile.next();
		    
		    Student stu = new Student(n, a, s);
		    stuList.add(stu);

		    if(s.contains("LOCAL")) {
		    	counter++;
		    }
		    
		    if(s.contains("INTERNATIONAL")) {
		    	counter2++;
		    }
		    
		    //System.out.printf(n + "  " + a + "  " + s + "\n");
		}
		
		System.out.println();
		for(Object obj : stuList) {
			System.out.printf(obj.toString());
			System.out.println();
			System.out.println();
		}
		
		System.out.println("\n\nThe total number of local student is " + counter);
		System.out.println("The total number of international student is " + counter2);
		
		inputFile.close();
	}

}
