package com.mani.java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args){
		ArrayList<Integer> myList = new ArrayList<>();
		for(int i=30;i<50;i++){
			myList.add(i);
		}
		
		Stream<Integer> pStream = myList.parallelStream();
		//pStream.forEach(p -> System.out.println(p));
		
		Stream<Integer> filteredStream = pStream.filter(p -> p>40);
		filteredStream.forEach(q -> System.out.println("Filter :"+q));
		
	}
	

}
