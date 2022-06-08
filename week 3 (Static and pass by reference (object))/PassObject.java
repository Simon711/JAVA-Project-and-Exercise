class Rectangle {
  private double width;
  private double length;

  public Rectangle (double w,double l) {
    width = w;
    length = l;
  }

 public void setWidth(double w) {
    width = w;
  }

  public void setLength(double l) {
    length = l;
  }

  public double getWidth() {
      return width;
    }

    public double getLength() {
      return length;
    }

  public double calcArea() {
  	  return width * length;
    }


  public boolean equals(Rectangle r) {
       return (this.calcArea() == r.calcArea());
    }


public class PassObject{
 public static void main(String[] args)  {
      Rectangle box1 = new Rectangle(12.0, 5.0);
      Rectangle box2 = new Rectangle(10.0, 6.0);
		System.out.println(box1.calcArea());

      if (box1.equals(box2))
         System.out.println ("Yes, it's equals");
      else
         System.out.println ("No, it's not equal");
    }
