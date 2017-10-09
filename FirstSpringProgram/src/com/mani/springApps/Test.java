package com.mani.springApps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Student student = context.getBean(Student.class,"student");
		student.displayInfo();
		
	/*	Resource resource=new ClassPathResource("context.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Student student=(Student) factory.getBean("student");  
	    student.displayInfo();
		*/
	}

}
