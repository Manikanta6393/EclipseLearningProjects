package com.date12Jul17.qstns;

import java.util.Calendar;

public class MyThread extends Thread 
{
	int var;
    public static void main(String [] args) 
    {
    	int a=20;
    	a = a^2;
    	System.out.println("a: "+a);
    	Calendar cal = Calendar.getInstance();
    	cal.add(Calendar.DATE, 10);
    	System.out.println(cal.getTime());
    	
        /*MyThread t = new MyThread();
       // Thread x = new Thread(t);
        t.start();  Line 7 */
    }
  /*  public void run() 
    {
        for(int i = 0; i < 4; ++i) 
        {
            System.out.print(i + "..");
        }
    }*/
}
