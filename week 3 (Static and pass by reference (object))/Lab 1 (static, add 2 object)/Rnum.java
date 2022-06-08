public class Rnum{
	private double num, denom;

	public Rnum (double a, double b){
		num = a;
		denom=b;
	}

	public double getNum(){
		return num;
	}

	public double getDenom(){
		return denom;
	}

	public void print(){
		System.out.print(num + "/" + denom);
		System.out.println ("=" + (num/denom));
	}

	public Rnum add(Rnum obj1, Rnum obj2, Rnum obj3){
		obj2.num = obj1.num/obj1.denom;
		obj2.denom = obj2.num/obj2.denom;
		//System.out.println (obj3);
		return obj3;
	}

	public static void main(String[] args) {
		Rnum num1 = new Rnum(5,10);
		Rnum num2 = new Rnum(3,4);
		Rnum num3 = new Rnum(0,0);
		num1.print();
		num2.print();
		num2.add(num1, num2, num3);
		num2.print();

	}
}