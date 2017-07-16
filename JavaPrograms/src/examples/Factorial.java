package examples;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial value: ");
		int number =sc.nextInt();
		long fact = 1;
		for(int i=1;i<=number;i++){
			fact = fact*i;
		}
		System.out.println("Factorial value of "+number+" is: "+fact);
	}

}
