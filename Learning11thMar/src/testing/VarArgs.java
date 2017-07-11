package testing;

public class VarArgs extends Example{
	public enum Season { WINTER, SPRING, SUMMER, FALL;}
	/* static void display(String... values){  
		  System.out.println("display method invoked ");  
		  for(String s:values){  
		   System.out.println(s);  
		  }  
		 }  
		  
		 public static void main(String args[]){  
		  
		 display();//zero argument   
		 display("hello");//one argument   
		 display("my","name","is","varargs");//four arguments  
		 } */  

	static void m(int i){System.out.println("int");}  
	  static void m(Integer i){System.out.println("Integer");}  
	  
	  public static void main(String args[]){  
	   /*short s=30;  
	   m(s);*/
		  Season s=Season.WINTER;//enum type is required to access WINTER  
		  System.out.println(s);  
	 }  
}
