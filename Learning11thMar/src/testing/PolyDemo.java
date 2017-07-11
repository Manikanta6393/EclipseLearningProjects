package testing;

class Sub1 extends PolyDemo{

}

public class PolyDemo{

	protected void display() {
		System.out.println("Poly");
	}
	
	public PolyDemo() {
		
	}

	public static void main(String[] args) {
		PolyDemo obj = new Sub1();
		obj.display();

	}

}
