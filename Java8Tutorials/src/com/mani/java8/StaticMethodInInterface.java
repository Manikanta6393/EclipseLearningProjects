package com.mani.java8;

@FunctionalInterface
public interface StaticMethodInInterface {
	
	default void defaultMethod(){
		System.out.println("This is default method2");
	};
	
	static void staticMethod(){
		System.out.println("This is static method2");
	};
	//void method();
	
	void method2();
	
}
