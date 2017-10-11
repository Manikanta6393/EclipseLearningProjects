package com.mani.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class EmployeeXMLConfigAspect {
	
	/*public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("EmployeeXMLConfigAspect:: Before invoking getName() method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("EmployeeXMLConfigAspect:: After invoking getName() method. Return value="+value);
		return value;
	}*/
	public void employeeBeforeAdvice(){
		System.out.println("EmployeeXMLConfigAspect-Manikantha:: before invoking getName() method");
	}
	
	public void employeeAfterAdvice(){
		System.out.println("EmployeeXMLConfigAspect-Manikantha:: after invoking getName() method");
	}
	
	public void employeeReturning(){
		System.out.println("EmployeeXMLConfigAspect-Manikantha:: after Returning getName() method");
	}
	public void employeeThrowing(){
		System.out.println("EmployeeXMLConfigAspect-Manikantha:: after Throwing method");
	}

}
