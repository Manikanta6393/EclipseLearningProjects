package examples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find whether it is Palindrome: ");
		int number =sc.nextInt();
		
		int numberCopy=number;
		int reverse=0,r;
		while(numberCopy>0){
			
			r=numberCopy%10;
			numberCopy= numberCopy/10;
			reverse=reverse*10+r;
		}
		
		if(number==reverse)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome Number");
	}

}
