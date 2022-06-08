
public class Pizza {
	private String description;
	private Size saiz;
	
	public Pizza(String d, String s) {
		description = d;
		saiz = Size.valueOf(s);
	}
	
	public String getDescription() {
		return description;
	}
	
	public Size getPizzaSize(){
		return Size.valueOf(saiz.getSize());
	}
	
	
}
