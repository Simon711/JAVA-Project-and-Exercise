import java.util.ArrayList;

public class ArrayMixedObjects {
public static void main (String[] args) {
  // (a) create an ArrayList named mixedObject
	ArrayList<Object> mixedObjects = new ArrayList<Object>();
  // (b)create object of Bulatan, Student and Employee and add to ArrayList mixedObject	
	Bulatan bulatan = new Bulatan(2,2,4);
	mixedObjects.add(bulatan);
	
	Student student = new Student("Simon", 4.00);
	mixedObjects.add(student);
	
	Employee employee =new Employee("Simon", "Active", 5000);
	mixedObjects.add(employee);
	
// (c)display info of each object by invoking display() method in respective class
	Bulatan a = (Bulatan)mixedObjects.get(0);
	Student b = (Student)mixedObjects.get(1);
	Employee c = (Employee)mixedObjects.get(2);
	
	a.display();
	b.display();
	c.display();
	
	
//(d) display info of each object using enhanced for-loop & toString() method in respective class
	System.out.println("\n\n");
	for(Object obj : mixedObjects) {
		System.out.println(obj.toString());
	}
	
}
}