package examples;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find whether it is Perfect Number or not: ");
		int number =sc.nextInt();
		
		int r=0;
		for(int i=1;i<number;i++){
			if(number%i==0)
				r=r+i;
		}
		
		if(number==r)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");
	}

}
