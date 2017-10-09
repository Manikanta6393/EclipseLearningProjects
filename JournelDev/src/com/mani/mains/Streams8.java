package com.mani.mains;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams8 {
	
	public static void main(String[] ar){
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<100;i++) al.add(i);
		
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		List<Integer> intList = numbers.collect(Collectors.toList());
		System.out.println(intList); //prints [1, 2, 3, 4]

		
		Stream<Integer> seqStream= al.stream();		
		Stream<Integer> highNums = seqStream.filter(p -> p>90);
		highNums.forEach(i -> System.out.println(i));
		Stream<String> sStream = Stream.of("Mani","kANTA");
		List<String> upStrings = sStream.map(p -> {return p.toUpperCase();}).collect(Collectors.toList());
		System.out.println(upStrings);
				
 			
	}

}
