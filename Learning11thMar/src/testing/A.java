package testing;

public class A {
	Object k = new Object();
	Thread t = new Thread();

	void m(){System.out.println("hello m");}  
	  
	@Deprecated  
	void n(){System.out.println("hello n");}  
	}  
	  
	class TestAnnotation3{  
	public static void main(String args[]){  
	  
	A a=new A();  
	a.n();  
	}

}
