package collectionsExamples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreSet {

	
	public static void main(String[] args){
		TreeSet<String> aList = new TreeSet<>();
		aList.add("1");
		aList.add("20");
		aList.add("9");
		aList.add("2");
		//System.out.println(aList.size());
		
		Iterator<String> it = aList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
	
}
