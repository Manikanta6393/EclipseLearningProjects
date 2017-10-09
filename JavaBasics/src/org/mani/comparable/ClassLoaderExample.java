package org.mani.comparable;

public class ClassLoaderExample {

	public static void main(String[] args) {
	System.out.println(java.util.HashMap.class.getClassLoader());
	System.out.println(ClassLoaderExample.class.getClassLoader());
	
	}

}
