package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to find duplicates: ");
		String str =sc.next();
		HashMap<Character,Integer> countMap = new HashMap<>();
		
		/*for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					System.out.println(str.charAt(i));
					break;
				}
			}
		}*/
		for(int i=0;i<str.length();i++){
			if(countMap.containsKey(str.charAt(i))){
				int charCount = countMap.get(str.charAt(i));
				int count = charCount+1;
				countMap.put(str.charAt(i), count);
			}else{
				countMap.put(str.charAt(i), 1);
			}
		}
		System.out.println("Summary: ");
		for(Map.Entry m:countMap.entrySet())
			System.out.println(m.getKey()+" repeated "+m.getValue()+" time(s)");
		sc.close();
	}

}
