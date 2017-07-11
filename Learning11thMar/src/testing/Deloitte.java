package testing;

public class Deloitte {
	public static void main(String[] args){
		/*Deloittetax dc =  new Deloittecon();
	    dc.tax();*/
		
		String str= "abcdabcd";
		str = str.replaceFirst("ab", "dd");
		System.out.println(str);
	}
}

class Deloittetax {  void tax(){
   System.out.println("Detax");
 }}

class Deloittecon extends Deloittetax {  void tax(){
  System.out.println("Decon");
}}