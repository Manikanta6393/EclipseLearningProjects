package com.mani.spring.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mani.services.MessageService;

@Component
public class MyApplication {
		
		//field-based dependency injection
		//@Autowired
		private MessageService msgServ;
		
		//constructor-based dependency injection
		@Autowired
		public MyApplication(MessageService svc){
			this.msgServ = svc;
		}
		
		//@Autowired
		public void setMsgServ(MessageService svc) {
			this.msgServ = svc;
		}
		
		public boolean processMessage(String msg, String rec){
			return this.msgServ.sendMessage(msg, rec);
		}
}
