class Travel {

	private String destination, travellerName, travellerAddr;
	private double price;

	public Travel(){}

	public Travel(String travellerName, String destination){
		this.travellerName = travellerName ;
		this.destination= destination;
		}

	public void setDestination(String d){
			destination = d;
			}

	public void setTravellerName(String n){
		travellerName = n;
		}

	public void setTravellerAddr(String a){
		travellerAddr = a;
		}

	public void setPrice(double p){
		price = p;
	}

	public String getDestination(){
		return destination;
		}

	public String getTravellerName(){
		return travellerName;
		}

	public String getTravellerAddr(){
		return travellerAddr;
		}

	public double getPrice(){
		return price;
	}

	public void display(){
		System.out.println("Name is " + travellerName + " and destination is " + destination);
	}

	public String toString(){
		return ("Name is " + travellerName + " and destination is " + destination);
	}
}

public class TestTravel{
	public static void main(String[] args){

		Travel obj1 = new Travel();
		Travel obj2 = new Travel("Simon","Kuching");
		Travel obj3 = new Travel("Chong","Johor");
		Travel obj4 = new Travel();

		obj1.display();
		System.out.println(obj2.getTravellerName());
		System.out.println(obj2.getDestination());
		System.out.println(obj3.toString());
		obj4.setPrice(999);
		System.out.printf("Price is RM%.2f\n",obj4.getPrice());
	}
}