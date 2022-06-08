public class Student {
  private String name;
  private double gpa;

  public Student () {
    name = "";
	gpa  = 0.0;
  }

  public Student (String n, double g) {
    name = n;
	gpa  = g;
  }

  public String getName () {return name;}
  public void setName (String n) {name = n;}

  public double getGpa () {return gpa;}
  public void setGpa (double g) {gpa = g;}

  public void display () {
    System.out.print ("Name: " + name + "\tGPA: " + gpa + "\n");
  }

  public String toString () {
    return String.format("Name: " + name + "\tGPA: " + gpa + "\n");
  }

}