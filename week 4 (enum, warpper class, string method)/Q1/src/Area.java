//Simon Chong Kai Yuen A19EC3028
//Clive Lai Yi Cheng A19EC3019


class Land{
	
	private Double length = 0.0, width = 0.0;
	
	public Land(Double l, Double w) {
		length = l;
		width = w;
	}
	
	public Double calc() {
		return length * width;
	}
	
	public void display() {
		System.out.println(calc());
	}
}


public class Area {

	public static void main(String[] args) {
		Land land = new Land(10.5, 90.5);
		land.display();
	}

}
