package example;

import java.util.StringTokenizer;

public class General {

	public static void main(String[] args) {
		String reverse = "",str = "Welcome to Java";

		 StringTokenizer st = new  StringTokenizer(str);

		 while(st.hasMoreTokens())  {
			 reverse = st.nextToken()+" "+reverse;
		       //System.out.println(st.nextToken());
		       System.out.println(reverse);
		   }


	}

}
