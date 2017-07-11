package org.mani.logics;

import java.util.HashMap;
import java.util.Map;

import org.mani.beans.BankCustomer;

public class BankCustomerLookup {
	private static Map<String,BankCustomer> customers = new HashMap<String,BankCustomer>();
	
	static{
		customers.put("1",new BankCustomer("11","Benny","N",100.0));
		customers.put("2",new BankCustomer("12","Mani","T",100.0));
		customers.put("3",new BankCustomer("13","Ramya","P",10000.0));
		customers.put("4",new BankCustomer("14","Srinad","B",-1000.0));
		customers.put("5",new BankCustomer("15","Divya","K",10000.0));
		customers.put("6",new BankCustomer("16","Ashwini","S",10.0));
	}
	
	public static BankCustomer getCustomer(String id){
		System.out.println("Entered ID is "+id);
		return(customers.get(id));
	}
	
}
