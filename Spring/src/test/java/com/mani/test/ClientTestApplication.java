package com.mani.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mani.spring.consumer.MyXMLApplication;

public class ClientTestApplication {
	
	public static void main(String[] args){
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		app.processMessage("Hi Manikantha", "mani@dxc.com");
		context.close();*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyXMLApplication app = context.getBean(MyXMLApplication.class);
		app.processMessage("Hi Manikantha", "mani@dxc.com");
		context.close();
		
	}

}
