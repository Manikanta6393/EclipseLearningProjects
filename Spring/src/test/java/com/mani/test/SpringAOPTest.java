package com.mani.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mani.services.EmployeeService;

public class SpringAOPTest {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationWithAOP.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		//System.out.println(employeeService.getEmployee().getName());
		//employeeService.getEmployee().setName("Mani");
		//employeeService.getEmployee().throwException();
		//ctx.close();
		System.out.println(employeeService.hashCode());
		EmployeeService employeeService2 = ctx.getBean("employeeService", EmployeeService.class);
		System.out.println(employeeService2.hashCode());
	}

}
