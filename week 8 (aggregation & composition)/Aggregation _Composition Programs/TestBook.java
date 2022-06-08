public class TestBook
{
  public static void main(String args[])
  {
    Author auth = new Author("John", 22, "India");
    Book b = new Book("Java", 550, auth);
    b.showDetail();
 }
}