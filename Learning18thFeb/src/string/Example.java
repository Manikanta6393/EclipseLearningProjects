package string;

public class Example {
	
	public static void main(String []  args){
		String s1 = "abc";
		System.out.println(s1.hashCode());
		String s2 ="ghi";
		s1=s1+s2;
		System.out.println(s1+" "+s1.hashCode());
		//System.out.println(s1.equals(s2));
		/*String s3 = new String("Hello"); 
		String s4 = new String("Hello"); 
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));*/
		}

}
