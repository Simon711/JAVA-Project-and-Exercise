//Simon & Clive

class Cat{
	private String name;
	private int age;
	private int yearAdopt;
	
	Cat(String n, int a, int y){
		name = n;
		age = a;
		yearAdopt = y;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int calNumOfYear() {
		int result;
		result = 2021-yearAdopt;
		return result;
	}
}
class Person{
	private String name;
	private String address;
	private Cat[] myCat;
	private int counter = 0;
	
	Person(String n, String a){
		name = n;
		address = a;
		myCat = new Cat[10];
	}
	
	public void adopt(Cat c) {
		myCat[counter] = c;
		counter++;
	}
	
	public void print() {
		System.out.println("Name : " + name + "\nAddress : " + address + "\n");
		System.out.println("-------Adopted Cat list-------");
		for(int i=0; i<counter; i++) {
			Cat c = (Cat)myCat[i];
			System.out.println((i+1) + ". Name : " + c.getName() + "\n   Age : " + c.getAge() + "\n   Years of adopted cat : " + c.calNumOfYear() + "\n");
		}
	}
}

public class AdoptionTest {

	public static void main(String[] args) {
		Person person = new Person("Simon", "Sarawak, Kuching");
		Cat cat1 = new Cat("Hihi", 7, 2016);
		Cat cat2 = new Cat("Meow Meow", 3, 2020);
		Cat cat3 = new Cat("HaHa", 13, 2011);
		
		person.adopt(cat1);
		person.adopt(cat2);
		person.adopt(cat3);
		person.print();
	}

}
