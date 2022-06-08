//Simon & CLive pg 215

class X{
	private int d;
	
	public X(int c) {
		d=c;
	}
	
	public int f() {
		return d+1;
	}
}

class Y extends X{
	private int g;
	
	public Y (int s, int t) {
		super(s);
		g=t;
	}
	
	public int h() {
		return g-1;
	}
}

public class Test {
	public static void main (String[] args) {
		X e = new X(3);
		Y n = new Y(2,7);
		System.out.println(e.f());
		System.out.println(n.f());
		System.out.println(n.h());
	}
}
