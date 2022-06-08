//Clive
//Simon
//Tong
//Anusia

import java.util.*;
import java.io.*;

enum Assessment {
	QZ1("Quiz 1", 5),
	QZ2("Quiz 2", 5),
	LE1("Lab Exercise 1", 4),
	LE2("Lab Exercise 2", 3),
	LE3("Lab Exercise 3", 5);
	
	private String description;
	private double percentage;
	private double marks;
	
	Assessment(String description, double percentage) {
		this.description = description;
		this.percentage = percentage;
		this.marks = 0;
	}
	
	public String getDescription() { 
		return description; 
	}
	
	public double getPercentage() { 
		return percentage; 
	}
	
	public double getMarks() { 
		return marks; 
	}
	
	public void setMarks(double marks) { 
		this.marks = marks*this.percentage/100; 
	}
}

class AcademicInfo {
	private int year;
	private String course;
	public AcademicInfo(int year, String course) {
		this.year = year;
		this.course = course;
	}
	public String getFullInfo() {
		return year + " " + course;
	}
}

class Student {
	private String name;
	private AcademicInfo academicInfo;
	private Vector<Assessment> assessmentList;
	
	public Student(Assessment assessment, double marks, String name, int year, String course) {
		assessmentList = new Vector();
		this.complete(assessment, marks);
		this.name = name;
		academicInfo = new AcademicInfo(year, course);

	}
	
	public String getName() { 
		return name; 
	}
	
	public void complete(Assessment assessment, double marks){
		assessmentList.addElement(assessment);
		assessmentList.elementAt(assessmentList.size()-1).setMarks(marks);
	}
	
	public void display() {
		System.out.printf("Student name:  %s%n", name);
		System.out.printf("Year & Course: %s%n", academicInfo.getFullInfo());
		System.out.printf("List of complete assessment: %n");
		
		int columnLength = 40;
		
		System.out.println("=".repeat(columnLength));
		System.out.printf("%-15s%15s%10s%n", "Assessment", "Percentage", "Marks");
		System.out.println("=".repeat(columnLength));
		System.out.printf("%n");
			
		double cumulativeMarks = 0;
		
		for(Assessment a : assessmentList) {
			cumulativeMarks += a.getMarks();
			System.out.printf("%-15s%14.2f%%%9.2f%%%n", a.getDescription(), a.getPercentage(), a.getMarks());
		}
		
		System.out.println("-".repeat(columnLength));
		System.out.printf("%-26s%13.2f%%%n", "Total marks (cumulative): ", cumulativeMarks);
		System.out.println("-".repeat(columnLength));
		System.out.printf("%n%n");
	}
}

class Test {
	public static void main(String[] args) throws FileNotFoundException {
		Vector<Student> student = new Vector();
		Scanner scannerData = new Scanner(new java.io.File("input.txt"));
		Scanner scannerDataLine;
		String[] data = new String[6];
		boolean studentFound = false;
		while(scannerData.hasNextLine()) {
			scannerDataLine = new Scanner(scannerData.nextLine());
			int i=0;
			while(scannerDataLine.hasNext()) {
				data[i] = scannerDataLine.next();
				i++;
			}
			for(Student s : student) {
				if(s.getName().equals(data[2] + " " + data[3])) {
					studentFound = true;
					s.complete(Assessment.valueOf(data[0]), Double.parseDouble(data[1]));
					break;
				}
			}
			if (studentFound == false) {
				student.addElement(new Student(Assessment.valueOf(data[0]), Double.parseDouble(data[1]), (data[2] + " " + data[3]), Integer.parseInt(data[4]), data[5]));
			}
			studentFound = false;
		}
		for(Student s : student) {
			s.display();
		}
	}
}