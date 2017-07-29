package trickyExamples;

import java.util.Random;

public class StringBufferWithChar {
	private static Random rnd = new Random();
	

	public static void main(String[] args) {
		StringBuffer word = null;
		switch(rnd.nextInt(5)){
		case 1:
			word = new StringBuffer('M');
		case 2:
			word = new StringBuffer('G');
		default:
			word = new StringBuffer('P');
		}
		
		word.append("ain");
		
		System.out.println(word);
		
	}

}
