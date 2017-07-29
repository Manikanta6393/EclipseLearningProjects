package trickyExamples;

class A{
	void method(int i){
		System.out.println("A int");
	}
	
	void maniMethod(){
		System.out.println("Hi Mani");
	}
}

class B extends A{
	void method(Integer i){
		System.out.println("B Integer");
	}
}

public class AutoBoxOverride {
	
	public static void main(String args[]){
		A a = new B();
		a.maniMethod();
		a.method(new Integer(1));
		a.method(1);
		
		B b = new B();
		b.method(new Integer(1));
		b.method(1);
	}

}
