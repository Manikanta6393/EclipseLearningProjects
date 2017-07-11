package collectionsExamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hMap {

	
	public static void main(String[] args){
		HashMap<Integer,String> aList = new HashMap<>();
		aList.put(1,"T");
		aList.put(20,"Mani");
		aList.put(9,"Kanta");
		aList.put(2,"ji");
		//System.out.println(aList.size());
		
		Collection<String> s = aList.values();
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
	
}
