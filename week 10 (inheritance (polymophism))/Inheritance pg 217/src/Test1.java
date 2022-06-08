
class A {
	public A() {
		System.out.println("Default constructor A is invoked");
	}
	
	public A(String x) {
		System.out.println(x);
	}
}

class B extends A{
	public B() {
		this("Another constructor of B is invoked");
		System.out.println("Default constructor of B is invoked");
	}
	
	public B(String s) {
		System.out.println(s);
	}
	
	public B(String s, String x) {
		super(x);
		System.out.println(s);
	}
}	

public class Test1{
	public static void main (String[] args) {
		//B b1 = new B();
		//A b1 = new A();
		//B b1 = new B("Thank you");
		B b1 = new B("Thank you", "Come again");
	}
}
