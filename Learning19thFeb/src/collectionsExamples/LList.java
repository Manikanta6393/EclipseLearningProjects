package collectionsExamples;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

public class LList {

	
	public static void main(String[] args){
		LinkedList<Object> aList = new LinkedList<>();
		aList.add(1);
		aList.add(20);
		aList.add(9);
		aList.add(2);
		aList.addFirst("Mani");
		aList.addLast("Kanta");
		aList.addFirst("Thodupunoori");
		aList.addLast("ji");
		aList.add(3,"Kanta");
		//System.out.println(aList.size());
		
		Iterator<Object> it = aList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Enumeration<Object> en = Collections.enumeration(aList);
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		System.err.println("----------");
		System.out.println(aList.get(0));
		
	}
	
}
