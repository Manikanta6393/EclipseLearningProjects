package org.mani.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainApp2 {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(2);
		
		Set<Integer> set = new HashSet<>();
		set.addAll(s);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			int temp = it.next();
			System.out.println(temp);
		}
		
	}

}
