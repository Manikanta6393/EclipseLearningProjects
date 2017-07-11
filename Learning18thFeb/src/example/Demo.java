package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo{
	 int sno;
	String name;
	static String college="Vasavi";

	public String getName(){
		return name;
	}
	public static void main(String [] args) throws IOException{
	Demo d1 = new Demo();
	int x = 0;
	System.out.println("x="+x);
	//int y=sno;
	int y = d1.sno;
	d1.print();
	System.out.println("Press Key");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	String d ;
	try {
		d = sc.nextLine();
	} finally{
		
	}
	//InputStreamReader d = new InputStreamReader(System.in);
	System.out.println(d);
	}
	public void print(){
		
	}
	}

