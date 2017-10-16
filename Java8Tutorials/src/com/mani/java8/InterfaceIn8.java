package com.mani.java8;

public class InterfaceIn8 extends Object implements DefaultMethodInInterface,
		StaticMethodInInterface{

	public InterfaceIn8() {
	}

	@Override
	public void method() {
		
	}
	@Override
	public void method2() {
	}
	
	public void defaultMethod(){
		System.out.println("This is default method2");
	};
	
	Runnable r = new Runnable(){
		@Override
		public void run() {
		}
	};
	
	Runnable r1 = () -> System.out.println("Hi"); 
	
}
