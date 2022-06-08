import java.util.*;//pg 127

enum Size {
  SMALL ("S"), MEDIUM ("M"), LARGE ("L"), EXTRA_LARGE ("XL");

  private String abbreviation;

  private Size (String a) {
    abbreviation = a;
  }

  public String getAbbreviation () {
    return abbreviation;
  }
}

public class EnumTest {
  public static void main (String[] x) {
    Scanner in = new Scanner (System.in);
    System.out.println ("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
    String input = in.next().toUpperCase();
    Size size    = Enum.valueOf(Size.class, input);
    System.out.println ("size=" + size);
    System.out.println ("abbreviation=" +size.getAbbreviation());
    if (size == Size.EXTRA_LARGE)
      System.out.println ("Good job--you pay attention to the _.");
  }
}