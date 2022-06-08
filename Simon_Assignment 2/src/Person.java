//Simon

// a)i)  4 attributes: gender, age, background and status
public class Person {	
	private String gender;
	private int age;
	private String background;
	private String status;
	public static int counter=0;
	
	// a)ii) constructor for class Person
	Person(String g, int a, String b, String s){  
		gender = g;
		age = a;
		background = b;
		status = s;
	}
	
	// a)iii) getter (accessor) methods.
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBackground() {
		return background;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String toString() {
		return String.format("%-10s %-8s %-17s %-1s", gender, age, background, status);
	}
}
