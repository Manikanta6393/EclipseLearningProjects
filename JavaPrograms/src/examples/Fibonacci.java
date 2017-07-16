package examples;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Fibonacci values you want: ");
		int number =sc.nextInt();
		int a=0,b=1,c=0;
		
		for(int i=1;i<=number;i++){
			System.out.print(c+"\t");
			a=b;
			b=c;
			c=a+b;
		}
	}

}
