package collectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class AList {

	
	public static void main(String[] args){
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(1);
		aList.add(20);
		aList.add(9);
		aList.add(2);
		//System.out.println(aList.size());
		
		Iterator<Integer> it = aList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.err.println("----------");
		Enumeration<Integer> en = Collections.enumeration(aList);
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		System.err.println("----------");
		System.out.println(aList.get(0));
		
	}
	
}
