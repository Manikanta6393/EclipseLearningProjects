package org.mani.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) {
		Employee e1 = new Employee("Mani",1,12000.00);
		Employee e2 = new Employee("Manikanta",2,12520.00);
		Employee e3 = new Employee("Mani",1,12000.00);
		
		List<Employee> s = new ArrayList<>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		Set<Employee> set = new HashSet<>();
		set.addAll(s);
		System.out.println(e1.hashCode()+" "+e3.hashCode());System.out.println(e1.equals(e3));
		System.out.println(set.size());
		
		/*Iterator<Employee> it = set.iterator();
		while(it.hasNext()){
			Employee temp = it.next();
			System.out.println(temp.toString()+" HashCode: "+temp.hashCode());
		}*/
		
	}

}
