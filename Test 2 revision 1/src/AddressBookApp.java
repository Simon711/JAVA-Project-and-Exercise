//Simon Chong Kai Yuen
//A19EC3028

class Address{
	private String street;
	private String city;
	private String state;
	
	public Address() {
		
	}
	
	public Address(String s, String c, String _s) {
		street = s;
		city = c;
		state = _s;
	}
	
	public String getFullAdress() {
		return street + ", " + city + ", " + state;
	}
}

class Person{
	private String name;
	private String phone;
	protected Address address;
	
	public Person() {
		
	}
	
	public Person(String n, String p, Address add) {
		name = n;
		phone = p;
		address = add;

	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setPhone(String p) {
		phone = p;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void displayAddressBook() {
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phone);
		System.out.println("Address: " + address.getFullAdress());
		System.out.println();
	}
}

class BusinessAssociate extends Person{
	private String jobtitle;
	private String companyName;
	
	public BusinessAssociate() {
		
	}
	
	public BusinessAssociate(String n, String p, Address add, String j, String c) {
		super(n,p,add);
		jobtitle = j;
		companyName = c;
	}
	
	public String getJobtitle() {
		return jobtitle;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void displayAddressBook() {
		System.out.println("Name: " + getName());
		System.out.println("Phone: " + getPhone());
		System.out.println("Job Title: " + jobtitle);
		System.out.println("Company : " + companyName);
		System.out.println("Address: " + address.getFullAdress());
		System.out.println();
	}
}

class PersonalFriend extends Person{
	private String message;
	
	public PersonalFriend() {
		
	}
	
	public PersonalFriend(String n, String p, Address add) {
		super(n,p,add);
	}
	
	public PersonalFriend(String n, String p, Address add, String m) {
		super(n,p,add);
		message = m;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void displayAddressBook() {
		System.out.println("Name: " + getName());
		System.out.println("Phone: " + getPhone());
		System.out.println("Address: " + address.getFullAdress());
		System.out.println("Message: " + message);
		System.out.println();
	}
}

class AddressBook{
	private Person[] entry;
	private int count = 0;
	
	public AddressBook() {
		
	}
	
	public AddressBook(int c) {
		entry = new Person[c];
	}
	
	public void addPerson(Person p) {
		entry[count] = p;
		count++;
	}
	
	public void displayAddressBook() {
		for (int i=0; i<count; i++) {
			entry[i].displayAddressBook();
		}
	}
}

public class AddressBookApp {

	public static void main(String[] args) {
		AddressBook book1 = new AddressBook(10);
		
		Address ad1 = new Address("No 2 Jalan Mawar", "Skudai", "Johor Bahru");
		Address ad2 = new Address("Block 1-7","Cheras", "Kuala Lumpur");
		Address ad3 = new Address("202-2 Jalan Bendahara", "Muar", "Johor");
		
		Person newfriend1 = new Person("Ms. X", "555-1212", ad1);
		book1.addPerson(newfriend1);
		
		BusinessAssociate b1;
		b1 = new BusinessAssociate("Mr. Yeo", "019-2342", ad2, "General Manager", "Motorola");
		book1.addPerson(b1);
		
		PersonalFriend f1 = new PersonalFriend("Mrs. Zyda", "012-8278", ad3, "My school mate");
		book1.addPerson(f1);
		
		book1.displayAddressBook();
	}
}
