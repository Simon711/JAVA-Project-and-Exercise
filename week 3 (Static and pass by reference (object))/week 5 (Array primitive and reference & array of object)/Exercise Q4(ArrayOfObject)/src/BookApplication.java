import java.util.Scanner;

class Book{
	private String title, author, ISBN;
	private int yearPublished;
	private double price = 0;
	
	Book(String t, String a, String i, int y, double p){
		title = t;
		author = a;
		ISBN = i;
		yearPublished = y;
		price = p;
		}
	
		public String getTitle(){
			return title;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public String getISBN() {
			return ISBN;
		}
		
		public int getYearPublised() {
			return yearPublished;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setTitle(String t) {
			title = t;
		}
		
		public void setAuthor(String a) {
			author = a;
		}
		
		public void setISBN(String i) {
			ISBN = i;
		}
		
		public void setYearPublished(int y) {
			yearPublished = y;
		}
		
		public void setPrice(double p) {
			price = p;
		}
		
		public static void displayBooks(Book book) {
			System.out.println("Title: " + book.getTitle());
			System.out.println("Author: " + book.getAuthor());
			System.out.println("ISBN: " + book.getISBN());
			System.out.println("Year of Published: " + book.getYearPublised());
			System.out.println("Price: RM " + book.getPrice());
			System.out.println();
		}
		
		public static double calcTotalPrice(Book[] book) {
			double totalPrice = 0.0;
			for (int i=0; i<book.length; i++) {
				totalPrice += book[i].getPrice();
			}
			return totalPrice;
		}
}


public class BookApplication {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Insert book array number : ");
		int booknum = input.nextInt();
		
		Book [] book = new Book[booknum];
		
		book[0] =  new Book("Java", "Dr.Norsham", "FC001", 1997, 1000);
		book[1] =  new Book("C++", "Dr.Chan", "FC002", 1998, 500);
		book[2] =  new Book("PHP", "Dr.Razana", "FC003", 1999, 300);
		book[3] =  new Book("Python", "Dr.Sharin", "FC004", 2000, 400);
		book[4] =  new Book("Sql", "Dr.Suriani", "FC005", 2001, 500);
		
		for(int i=0; i<booknum; i++) {
			Book.displayBooks(book[i]);
		}
		System.out.println("Total Price is : RM " + Book.calcTotalPrice(book));
	}
}
