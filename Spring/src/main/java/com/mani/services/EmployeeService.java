package com.mani.services;

import com.mani.model.Employee;

public class EmployeeService {
	
	private Employee employee;
	
	public Employee getEmployee(){
		return this.employee;
	}
	
	public void setEmployee(Employee e){
		this.employee=e;
	}

}
