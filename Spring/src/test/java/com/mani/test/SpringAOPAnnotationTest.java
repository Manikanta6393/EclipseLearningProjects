package com.mani.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mani.services.EmployeeService;

public class SpringAOPAnnotationTest {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationWithAOPAnnotation.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Mani");
		
		//employeeService.getEmployee().throwException();
		
		//ctx.close();
	}

}
