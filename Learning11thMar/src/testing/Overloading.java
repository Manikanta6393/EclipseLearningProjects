package testing;

public class Overloading {

	void dispaly(double a, float b){
		System.out.println("Double float");
	}
	void dispaly(double a, double b){
		System.out.println("Double Double");
	}
	
	public static void main(String args){
		Overloading obj = new Overloading();
		//obj.dispaly(10, 20.0f);
		System.out.println("HEllo");
	}
	public static void main(int i){
		Overloading obj = new Overloading();
		//obj.dispaly(10, 20.0f);
		System.out.println("Hi");
	}
}
