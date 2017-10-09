package com.mani.springApps;

public class Student extends Object{
	
	private String name;
	private Integer id;

	public Student(Integer id, String name) {
		this.name = name;
		this.id = id;
	}
	
	public Student(Integer id) {
		this.id = id;
	}
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void displayInfo(){
		System.out.println("Hello "+name+" and ID is "+id);
	}
	
}
