//Simon Chong Kai Yuen A19EC3028

import java.util.*;

class Employee{
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	Employee(){
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	
	Employee(String name, int idNumber, String department, String position){
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getPosition() {
		return position;
	}
	
//	public String toString() {
//		return ("\tName:" + name + "\t\tPosition:" + position); 
//	}
	
	public void display() {
		System.out.printf("Name: %s's  Position is %s", name, position);
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
	
	Employee emp1 = new Employee("Dr.Nor Sabrina", 47899, "Accouting", "Vice President");
	Employee emp2 = new Employee("En Ahmad", 39119, "IT", "Programmer");
	Employee emp3 = new Employee("Prof M Izzudin", 66666, "Consultation", "Manager");
	Employee emp4 = new Employee("Dr N Izzati", 34521, "Elect & Etronic", "CEO");
	Employee emp5 = new Employee("Dr A Rahman", 12321, "PR", "Manager");
	Employee emp6 = new Employee("Hello Word", 404, "Java", "Programming OOP"); //example to remove
	
	ArrayList<Object> arrList = new ArrayList<Object>();
	
	arrList.add(emp1);
	arrList.add(emp2);
	arrList.add(emp3);
	arrList.add(emp4);
	arrList.add(emp5);
	arrList.add(emp6); //example to remove
	
	System.out.println("---Array List---\nPrint name and position");

	for(Object obj : arrList) {
		System.out.println(obj);
	}
	
	if(arrList.contains(emp3) == true)
		System.out.println("\nYes, it is in the list");
	else
		System.out.println("It is not in the list");
	
	if(arrList.isEmpty()==false)
		System.out.println("Not Empty");
	else
		System.out.println("It is a empty list");
	
	arrList.set(1, emp3); //replace object emp3 to object with index 1 which is emp2
	arrList.remove(5);
	
	Employee[] emp = new Employee[5];
	
	for(int i=0; i<emp.length; i++) {	//set the object into another array list to display it by for loop
		emp[i] = (Employee)arrList.get(i);
	}
	
	System.out.println("\n\n---Array List---\nPrint name and position");
	for(int i=0; i<arrList.size(); i++) {
		emp[i].display();
		System.out.println();
	}
	
	
	//////////////////////////////////////////////////   Vector    ///////////////////////////////////////////////////////////////
	
	
	System.out.println("\n\n\n---Vector---");
	
	Vector<Object> arrList2 = new Vector<Object>();
	arrList2.addElement(emp1);
	arrList2.addElement(emp2);
	arrList2.addElement(emp3);
	arrList2.addElement(emp4);
	arrList2.addElement(emp5);
	arrList2.addElement(emp6);
	
	for(Object obj : arrList2) {
		System.out.println(obj);
	}
	
	arrList2.removeElementAt(5);
	
	if(arrList2.contains(emp6) == true)
		System.out.println("\nYes, it is in the list");
	else
		System.out.println("\nIt is not in the list"); //the emp6 with index 5 has been removed in line 133
	
	if(arrList2.isEmpty()==false)
		System.out.println("Not Empty");
	else
		System.out.println("It is a empty list");
	
	//the arguments in Vector(object,index) is in reverse compare to ArrayList(index, object)
	arrList2.setElementAt(emp4,1); //replace object emp4 to object with index 1 which is emp2
	
	
	Employee[] secondEmp = new Employee[5];
	
	for(int i=0; i<secondEmp.length; i++) { //set the object into another array list to display it by for loop
		secondEmp[i] = (Employee)arrList2.get(i); 
	}
	
	System.out.println("\n\n---Vector---\nPrint name and position");
	for(int i=0; i<arrList2.size(); i++) {
		secondEmp[i].display();
		System.out.println();
	}
}

}
