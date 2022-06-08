
public enum Size{
	S("Small",10), R("Regular", 15), L("Large", 25);
	
	private String saiz;
	private double price;
	
	Size(String s, double p){
		saiz = s;
		price = p;	
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getSize() {
		return saiz;
	}
}