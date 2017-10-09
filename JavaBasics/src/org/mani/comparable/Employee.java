package org.mani.comparable;

import java.util.Arrays;
import java.util.Comparator;
import static java.lang.System.currentTimeMillis;

public class Employee implements Comparable<Employee> {
	
	static class Mani{
		
	}
	
	private int id;
    private String name;
    private int age;
    private long salary;
    

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employee(){}

	 public Employee(int id, String name, int age, int salary) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	
	 
	 @Override
	    //this is required to print the user friendly information about the Employee
	    public String toString() {
	        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
	                this.salary + "]";
	    }
	
	
	public static void main(String args[]){
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);

		//sorting employees array using Comparable interface implementation
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
		
	}
	
	
	public static Comparator<Employee> AgeCompataor = new Comparator<Employee>(){
		@Override
		public int compare(Employee o1, Employee o2) {
			 return o1.getAge() - o2.getAge();
		}
	};
	




	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	

}
