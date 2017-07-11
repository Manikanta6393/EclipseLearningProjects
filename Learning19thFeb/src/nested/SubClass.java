package nested;

public class SubClass extends SuperClass{
	
	public final static String MANI = "Manikanta";
int b;
SubClass(int a){
   super(a);
   this.b=a;
}
@Override
SubClass createObject(int a ){
    return new SubClass(a);
}
@Override
public String toString(){
     return a+ "," + b;
}
public SubClass() throws Exception{  // Same or Super Type Exception for Constructors
    System.out.println("Welcome"); 
}
public void show() throws ArithmeticException{  // Same or Sub Type Exception for Instance methods
 super.show();
 System.out.println("I'm in sub class show() method"); 
}


public static void main(String[] args) {
	  SubClass obj1 = new SubClass(5);
	  System.out.println(obj1);
	  SuperClass  obj2 = new SubClass(10);
	}


}

