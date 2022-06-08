
public class Address {
	private String street;
	private String city;
	
	public Address(String s, String c){
		street = s;
		city = c;
	}
	
	public String toString() {
		return street + ", " + city;
	}
}
