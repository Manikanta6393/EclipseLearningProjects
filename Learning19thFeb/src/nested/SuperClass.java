package nested;

public class SuperClass {
	 int a;
	SuperClass(int a){
	 this.a=a;
	}
	SuperClass createObject(int a){
	  return new SuperClass(a);
	}
	
	public SuperClass() throws Exception{
		 System.out.println("Hi");
		}
		public void show() throws RuntimeException{
		 System.out.println("I'm in super class show() method");
		} 

	}
