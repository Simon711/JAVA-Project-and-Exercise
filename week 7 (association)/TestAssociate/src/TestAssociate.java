class Course{
	private String name;
	private String code;
	private int section;
	
	Course(String n, String c, int s) {
		name = n;
		code = c;
		section = s;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCode() {
		return code;
	}
	
	public int getSection() {
		return section;
	}
}

class Lecturer{
	private String name;
	private Course[] courseList;
	private int numOfCourse;
	
	Lecturer(String n){
		name = n;
		courseList = new Course[4];
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumOfCourse() {
		return numOfCourse;
	}
	
	public void teach(Course course) {
		courseList[numOfCourse] = course;
		numOfCourse++;
	}
	
	public void printAllInfo() {
		System.out.println("Lecturer name : " + name);
		System.out.println("Number of course : " + numOfCourse);
		System.out.println("List of Subject : ");
		for(int i=0; i<numOfCourse;i++) {
			Course c = (Course)courseList[i];
			System.out.println((i+1) + ". Course Name : " + c.getName() + ", Code :  " + c.getCode() + ", Section : " + c.getSection());
		}
	}
}
public class TestAssociate {
	public static void main(String[] args) {
		Course cs1 = new Course("C++", "SECV1234", 11);
		Course cs2 = new Course("OOP", "SECV4321", 5);
		Course cs3 = new Course("PSDA", "SECV6666", 6);
		
		Lecturer lect1 = new Lecturer("Simon");
		lect1.teach(cs1);
		lect1.teach(cs2);
		lect1.teach(cs3);
		
		lect1.printAllInfo();

	}
}
