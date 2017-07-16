package examples;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find whether it is Armstrong: ");
		int number =sc.nextInt();
		
		int temp=number;
		int sum=0,r;
		while(number>0){
			
			r=number%10;
			sum= sum+r*r*r;
			number=number/10;
		}
		
		if(temp==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong Number");
	}

}
