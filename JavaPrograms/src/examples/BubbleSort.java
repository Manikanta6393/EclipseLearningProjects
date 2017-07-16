package examples;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to sort");
		int count = sc.nextInt();
		int arrays[] = new int[count];
		System.out.println("Enter Elements : ");
		for(int i=0;i<=count-1;i++){
			arrays[i]=sc.nextInt();
		}
		int swap;
		for(int j=0;j<count-1;j++){
			for(int k=0;k<count-j-1;k++){
				if(arrays[k]<arrays[k+1]){
					swap=arrays[k];
					arrays[k]=arrays[k+1];
					arrays[k+1]=swap;
				}
			}
		}
		System.out.println("Sorted elements are:");
		for(int l=0;l<=count-1;l++){
			System.out.println(arrays[l]);
		}
		sc.close();
	}

}
