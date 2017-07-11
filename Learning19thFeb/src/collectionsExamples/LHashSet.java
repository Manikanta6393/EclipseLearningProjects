package collectionsExamples;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LHashSet {

	
	public static void main(String[] args){
		LinkedHashSet<Integer> aList = new LinkedHashSet<>();
		aList.add(1);
		aList.add(20);
		aList.add(9);
		aList.add(2);
		//System.out.println(aList.size());
		
		Iterator<Integer> it = aList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
	
}
