
public class Name {
	private String firstName;
	private String lastName;
	
	Name(String f, String l){
		firstName = f;
		lastName = l;
	}
	
	public String toString() {
		return firstName + lastName;
	}
}
