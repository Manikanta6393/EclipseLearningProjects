package com.mani.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {

	public static void main(String[] args){
		List<Integer> myList = new ArrayList<>();
		for(int i=0;i<10;i=i+2){
			myList.add(i);
		}
		
		myList.forEach(new Consumer<Integer>(){
			public void accept(Integer t){
				System.out.println("For each anonymous"+t);
			}
		});
		
	}

}
