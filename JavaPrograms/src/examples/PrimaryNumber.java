package examples;

import java.util.Scanner;

public class PrimaryNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find whether it is Prime: ");
		int number =sc.nextInt();
		
		int flag=0;
		for(int i=2;i<=Math.sqrt(number);i++){
			if(number%i==0){
				System.out.println("Not a Prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Prime Number");
		
	sc.close();
	}

}
