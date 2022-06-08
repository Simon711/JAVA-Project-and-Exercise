//Simon

import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Question{
	private String quesText;
	
	public Question(String q) {
		quesText = q;
	}
	
	public String getQuesText() {
		return quesText;
	}
}

class Answer{
	private String ansText;
	private double marks;
	
	public Answer(String a, double m) {
		ansText = a;
		marks = m;
	}
	
	public String getAnsText() {
		return ansText;
	}
	
	public double getMarks() {
		return marks;
	}
}

class LabAssignment{
	private double percentage;
	private Question quest;
	private Answer ans;
	
	public LabAssignment() {}
	public LabAssignment(double p, Question q, Answer a) {
		percentage = p;
		quest = q;
		ans = a;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public String getMarks() {
		Double m = percentage*ans.getMarks();
		String mark = Double.toString(m);  
		return mark;
	}
	
	public String toString() {
		return ("Percentage: " + percentage + 
				"\nQuestion: " + quest.getQuesText() + 
				"\nAnswer: " + ans.getAnsText() +
				"\nMarks: " + getMarks()  + "\n");
	}
}

class Student{
	private String name;
	private String matrix;
	private ArrayList<LabAssignment> asgnList;
	private int numSubmit = 0;
	
	public Student(String n, String m) {
		name = n;
		matrix = m;
		asgnList = new ArrayList<LabAssignment>();
	}
	
	public String getname() {
		return name;
	}
	
	public void submit(LabAssignment la) {
		asgnList.add(la);
		numSubmit++;
	}
	
	public void printInfo(){
		
		try {  
			File file = new File("Student_Lab.txt");
			FileWriter fr = new FileWriter(file, true);
			BufferedWriter br = new BufferedWriter(fr);
		    for(LabAssignment la : asgnList) {
		    	br.write("Name: " + name + "\n");
		    	br.write("Matrix: " + matrix + "\n");
		    	br.write(la.toString() + "\n");
				}
		    br.close();
		    fr.close();
		    System.out.println("Successfully wrote to the file.\n");
		   } 
			catch (IOException e) {
				System.out.println("An error occurred.");
		        e.printStackTrace();
		   }
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Question ques1 = new Question("What is 1+1 ?");
		Answer ans1 = new Answer("2", 0.5);
		
		LabAssignment LA1 = new LabAssignment(5, ques1, ans1);
		
		Student stu1 = new Student("Simon", "A19EC3028");
		stu1.submit(LA1);
		
		stu1.printInfo();
		
		Question ques2 = new Question("What is the biggest flower in the world ?");
		Answer ans2 = new Answer("Rafflesia", 2.0);
		
		LabAssignment LA2 = new LabAssignment(10, ques2, ans2);
		
		Student stu2 = new Student("Peter", "A19EC7685");
		stu2.submit(LA2);
		
		stu2.printInfo();
	}
}
