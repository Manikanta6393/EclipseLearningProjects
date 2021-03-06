package com.mani.services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.mani.model.Employee;

public class EmployeeService implements InitializingBean,DisposableBean{
	
	private Employee employee;
	
	public Employee getEmployee(){
		return this.employee;
	}
	
	public void setEmployee(Employee e){
		this.employee=e;
	}
	
	public EmployeeService(){
		System.out.println("EmployeeService no-args constructor called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable Bean :Before destroying");
		
	}
	
	public void destroy2(){
		System.out.println("destroy method:Before destroying");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean :after PropertiesSet");
			employee.setName("Mani");
	}
	
	public void init() {
		System.out.println("Init method :after PropertiesSet");
			employee.setName("Manikanta");
	}

}
