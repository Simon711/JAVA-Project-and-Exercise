import java.util.ArrayList;

public class Cuba {

	public static void main(String[] args) {
		ArrayList<String> student = new ArrayList<String>();
		student.add("Siti Rahimah");
		student.add("Robert Lau");
		
		System.out.println();
		for (int i=0; i<student.size(); i++)
			System.out.printf("Student[%d]: %s\n", i, student.get(i));
		System.out.println();
		
		student.set(0, "Muhammad");
		System.out.println(student.get(0));
		
	}

}
