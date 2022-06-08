class Travel {

	private String destination, travellerName, travellerAddr;
	static private double price;
    static int travellerCounter = 0;
    static int priceCounter = 0;

	public Travel(){
        travellerCounter++;
    }

	public Travel(String travellerName, String destination){
		this.travellerName = travellerName ;
		this.destination= destination;
        travellerCounter++;
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
		priceCounter += price;
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

public class TestTravel{

    public static void main(String[] args){
        new Travel();
        new Travel("Simon","Kuching");
        new Travel("Chong","Johor");
        Travel obj1 = new Travel();
        Travel obj2 = new Travel();
        obj1.setPrice(999);
        obj2.setPrice(999);
        System.out.println("Total traveller is "+ travellerCounter);
        System.out.println("Total price is "+ priceCounter);
        }
    }
}

