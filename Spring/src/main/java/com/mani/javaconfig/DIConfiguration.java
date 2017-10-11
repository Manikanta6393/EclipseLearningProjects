package com.mani.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mani.services.MessageService;
import com.mani.services.SMSService;

@Configuration
@ComponentScan(value={"com.mani.spring.consumer"})
public class DIConfiguration {
	
	@Bean
	public MessageService getMessageService(){
		return new SMSService();
	}

}
