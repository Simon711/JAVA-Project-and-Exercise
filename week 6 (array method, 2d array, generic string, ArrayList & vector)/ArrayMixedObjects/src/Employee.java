public class Employee {
  private String name;
  private String status;
  private double salary;
  private double bonus;

  public Employee () {}
  public Employee (String name, String status, double salary) {
    this.name   = name;
    this.status = status;
    this.salary = salary;

    if (this.status == "permanent")
      this.bonus = 0.25*salary;
  }

  public void display() {
    System.out.printf ("Employee %s with income of %.2f has %s status\n", name, (salary + bonus), status);
  }

  public String toString() {
    return String.format ("Employee " + name + " with income of " + (salary + bonus) + " has " + status + " status\n");
  }

}