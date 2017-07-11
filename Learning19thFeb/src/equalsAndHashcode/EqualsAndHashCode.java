package equalsAndHashcode;

public class EqualsAndHashCode {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1.equals(str2));
		System.out.println(str1 == (str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		String str3 = "Hello";
		String str4 = "Hello";
//		System.out.println(str3.equals(str4));
//		System.out.println(str3 == (str4));
//		System.out.println(str3.hashCode());
//		System.out.println(str4.hashCode());

	}

}
