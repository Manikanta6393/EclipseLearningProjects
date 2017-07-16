package examples;

import java.util.Scanner;

public class ListOfPrimaryNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of PrimeNumbers you want: ");
		int count =sc.nextInt();
		
		int flag=0,number=3;
		if(count>=1){
			System.out.println("Primer number(s) are:");
			System.out.println("2");
		}
		for(int j=2;j<=count;){
			flag=0;
			for(int i=2;i<=Math.sqrt(number);i++){
				if(number%i==0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(number);
				j++;
			}
			number++;
		}
		sc.close();
	}
}
