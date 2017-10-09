package com.mani.interfaces;

public interface MyData {
	
	default void print(String str){
		if(!isNull(str))
			System.out.println("My data: "+str);
	}

	static boolean isNull(String str){
		System.out.println("Interface Null check");
		return str == null ? true : "".equals(str) ? true : false;
		
	}
	

}
