package com.mani.services;

public class TwitterService implements MessageService {

	public boolean sendMessage(String msg, String rec) {
		System.out.println("Tweet Sent to "+rec+ " with Message="+msg);
		return true;
	}

}
