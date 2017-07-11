package testing;

import java.util.HashSet;
import java.util.Set;

public class ABCD2 {

	public static void main(String[] args) {
		int temp[] = new int[103];
		for(int i=0;i<100;i++){
			temp[i]=i;
		}
		temp[100]=59;
		temp[101]=99;
		temp[102]=78;
		
		Set<Integer> temp2= new HashSet<>();
		for(int i=0;i<temp.length;i++){
			if(!temp2.contains(temp[i]))
				temp2.add(temp[i]);
			else
				System.out.println(temp[i]);
		}
		
		
		
		

	}

}
