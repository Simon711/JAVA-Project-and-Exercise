class Animal {
   public void eat() {
      System.out.println("Generic Animal Eating Generically");
   }
}

class Horse extends Animal {
   public void eat() {
       System.out.println("Horse eating hay, oats, " + "and horse treats");
   }
   public void buck() {
      System.out.println ("This is how I jump");
   }
}

public class TestAnimals2 {
  public static void main (String [] args) {

    Animal a = new Animal();
    Animal b = new Horse();
    //Animal c = new Horse();
    Horse d = new Horse();

    a.eat();
    b.eat();
    d.eat();
    //c.buck();
  }
}
