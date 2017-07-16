package com.date12Jul17.qstns;

public class SwitchTest {
	private int  a[][];
	
	public static void main(String[] args) 
    {
        System.out.println("value =" + switchIt(4)); 
    } 
    public static int switchIt(int x) 
    {
        int j = 1;  
        
        switch (x) 
        { 
            case 1: j++; 
            case 2: j++;  
            case 3: j++; 
            case 4: j++; 
            case 5: j++; 
            default: j++; 
            } 
        return j + x;  
    } 

}
