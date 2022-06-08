public class Bulatan {
  private int centerX, centerY;
  private double radius;

  public Bulatan (int x, int y, int r) {
    centerX = x;
    centerY = y;
    radius  = r;
  }

  public double area () {return Math.PI*Math.pow(radius,2);}

  public void display() {
    System.out.printf ("Bulatan with center at (%d, %d), radius: %.2f, and area: %.2f\n", centerX, centerY, radius, area());
  }

  public String toString () {
    return "Bulatan with center at (" +  centerX + ", " + centerY + "), radius: " + radius + " and area: " + area() + "\n";
  }

}