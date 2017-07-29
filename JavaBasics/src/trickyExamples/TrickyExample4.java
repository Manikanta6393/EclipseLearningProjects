package trickyExamples;

public class TrickyExample4 {
	static void staticMethod(){
		System.out.println("Static");
	}
	public static void main(String args[]){
		/*TrickyExample4 t4 =null;
		t4.staticMethod();*/
		
		
		//Integer i = new Integer(null);
		//String s = new String(null);
		
		/*String s = "One"+2*5+"Two"+3+4*5+4/2+"Three";
		System.out.println(s);
		
		Integer i = - -5;
		System.out.println(i);*/
		
		Long l = new Long(1);
		System.out.println(l.equals(1L)); //Same with double and float
	}
}
