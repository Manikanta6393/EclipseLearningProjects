package staticAndInstance;

import java.util.Calendar;

public class TestRun {
	
	
	static String name = "Mani";
	int rollNo = 2;
	public void print(){
		//TestRun var1	= new TestRun();
	
		System.out.println("Name :"+name+" :: Roll Number: "+rollNo);
	}
	
	static public void main(String[] g){
	
	TestRun tt =new TestRun();
	tt.print();
	
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE, 2);
	System.out.println(cal.getTime());
	long time = System.currentTimeMillis();
	System.out.println(time);
	
}
}
