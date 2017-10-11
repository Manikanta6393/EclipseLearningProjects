package com.mani.services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.mani.model.Employee;

public class EmployeeServiceWithInitAndDestroyMethods{
	
	private Employee employee;
	
	public Employee getEmployee(){
		return this.employee;
	}
	
	public void setEmployee(Employee e){
		this.employee=e;
	}
	
	public EmployeeServiceWithInitAndDestroyMethods(){
		System.out.println("EmployeeService no-args constructor called");
	}

	public void destroy() {
		System.out.println("destroy method :Before destroying");
		
	}

	public void init() {
		System.out.println("Init method :after PropertiesSet");
		if(employee.getName() == null){
			employee.setName("Manikanta");
		}
	}

}
