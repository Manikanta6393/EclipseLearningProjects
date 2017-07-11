package collectionsExamples;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		try {
			Map myMap = new TreeMap();
			myMap.put("PostgreSQL", "Free Open Source Enterprise Database");
			myMap.put("DB2", "Enterprise Database , It's expensive");
			myMap.put("Oracle", "Enterprise Database , It's expensive");
			myMap.put("MySQL", "Free Open SourceDatabase");

			Iterator iter = myMap.entrySet().iterator();

			while (iter.hasNext()) {
				Map.Entry entry = (Map.Entry) iter.next();
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println(myMap.size()); 
			// put new value at key "Oracle"
			myMap.put("Oracle", "Enterprise Database , It's free now ! (hope)");
			System.out.println(myMap.size()); 
			System.out.println("One day Oracle.. : " + myMap.get("Oracle"));
		} 
		catch (Exception e) {
			System.out.println(e.toString());}
	} }

