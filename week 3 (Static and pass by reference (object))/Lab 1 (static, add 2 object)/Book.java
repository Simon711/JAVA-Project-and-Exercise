import java.util.Scanner;

public class Book{

	public static int bookInstance;
	private String title;
	private String author;
	private double price = 0.0;
	private int yearPublish;
	private double discount = 0.0;

	public Book(String title, String author){
		this.title = title;
		this.author = author;
		bookInstance++;
	}

	public void readInput(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year publish of your book: ");
		yearPublish = input.nextInt();
		System.out.print("Enter the price of your book: RM");
		price = input.nextDouble();
		System.out.println();
	}

	public double calBookPrice(){
		if (yearPublish < 2005){
			return discount = price*0.5;
			//return discount;
			}
		else if (yearPublish >= 2005 && yearPublish <= 2014){
			return discount = price*0.75;
			//return discount;
			}
		else if (yearPublish == 2015){
			return discount = price;
			//return discount;
			}
		else
			return price;
	}

	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return author;
	}

	public double getPrice(){
		return price;
		}

	public int getYearPublish(){
		return yearPublish;
		}

	public String toString(){
			return ("\nBook Name : " + title + "\nAuthor Name : " + author + "\nYear Publish : " + yearPublish + "\nBook price : RM" + price + "\nBook Price after Discount : " + calBookPrice());
		}

}


