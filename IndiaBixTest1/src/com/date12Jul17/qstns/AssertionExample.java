package com.date12Jul17.qstns;

import java.util.Scanner;

public class AssertionExample {
	public static void main( String args[] ){  
		
		String s = "foo"; 
        Object o = s;
        if (s.equals(o)) 
        { 
            System.out.print("AAA"); 
        } 
        else 
        {
            System.out.print("BBB"); 
        } 
        if (o.equals(s)) 
        {
            System.out.print("CCC"); 
        } 
        else 
        {
            System.out.print("DDD"); 
        } 
		  
		  /*Scanner scanner = new Scanner( System.in );  
		  System.out.print("Enter ur age ");  
		    
		  int value = scanner.nextInt();  
		  assert value>=18;  
		  
		  System.out.println("value is "+value);  */
		 }   

}
