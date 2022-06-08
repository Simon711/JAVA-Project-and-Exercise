public class Book
{
  String name;
  int price;
  Author auth;//declare the object of part class


  Book(String n,int p,Author at)
  {
    name = n;
    price = p;
    auth = at;
  }

  public void showDetail()
  {
    System.out.println("Book is " + name);
    System.out.println("price " + price);
    // using Author class funtion to get the name value
    System.out.println("Author is " + auth.getAuthorName());
  }
}