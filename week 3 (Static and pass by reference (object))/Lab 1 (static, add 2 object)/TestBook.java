public class TestBook {
	public static void main (String[] args){
		Book book1 = new Book("Java Programming", "Abu Bakar");
		Book book2 = new Book("Programming Technique", "Rafeah Ahmad");
		Book book3 = new Book("Happy Programming", "Sharif Hassan");

		book1.readInput();
		book2.readInput();
		book3.readInput();

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());

		book1.calBookPrice();
		book2.calBookPrice();
		book3.calBookPrice();

		System.out.println("\nThe number of books purchased: " + Book.bookInstance);
	}
}