package com.mani.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
public class EmployeeAspect {

	@Before("execution(* com.mani.model.*.getName())")
	@Order(2)
	public void getNameAdvice2(){
		System.out.println("Executing Advice on getName()-1");
	}
	
	@Before("execution(public String getName())")
	@Order(1)
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName()");
	}
	
	@Before("execution(* com.mani.services.*.get*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called");
	}
}
