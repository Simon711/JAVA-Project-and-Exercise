//Simon

class RoomDimension{
	private double length;
	private double width;
	
	RoomDimension(double l, double w){
		length = l;
		width = w;
	}
	
	public double getArea() {
		return length*width;
	}
	
	public String toString() {
		return ("The area is " + getArea());
	}
}

class RoomCarpet{
	private RoomDimension size;
	private double carpetCost;
	
	public RoomCarpet(RoomDimension rd, double cc) {
		size = rd;
		carpetCost = cc;
	}
	
	public double getTotal() {
		return size.getArea()*carpetCost;
	}
	
	public String toString() {
		return ("The total cost of the carpet is RM " + getTotal());
	}
}

public class TestRoom {

	public static void main(String[] args) {
		RoomDimension area = new RoomDimension(3, 3); //area = 3*3 = 9
		RoomCarpet price = new RoomCarpet(area, 9); //area * 9 = 81
		
		System.out.println(price.toString());

	}

}
