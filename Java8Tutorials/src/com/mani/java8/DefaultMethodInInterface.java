package com.mani.java8;

@FunctionalInterface
public interface DefaultMethodInInterface {
	
	default void defaultMethod(){
		System.out.println("This is default method");
	};
	
	void method();
	
//	void method2();

}
