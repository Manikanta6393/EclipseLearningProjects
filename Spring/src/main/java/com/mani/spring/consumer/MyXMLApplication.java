package com.mani.spring.consumer;

import com.mani.services.MessageService;

public class MyXMLApplication {
		
		private MessageService msgServ;
		
		/*//constructor-based dependency injection
		public MyApplication(MessageService svc){
			this.msgServ = svc;
		}*/
		
		public void setMsgServ(MessageService svc) {
			this.msgServ = svc;
		}
		
		public boolean processMessage(String msg, String rec){
			return this.msgServ.sendMessage(msg, rec);
		}
}
