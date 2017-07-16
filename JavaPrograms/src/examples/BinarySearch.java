package examples;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int count = sc.nextInt();
		int arrays[] = new int[count];
		System.out.println("Enter Elements in ascending order: ");
		for(int i=0;i<count;i++){
			arrays[i]=sc.nextInt();
		}
		System.out.println("Enter elements to search");
		int search = sc.nextInt();
		
		int startIndex=0,endIndex=count-1,mid,flag=0;
		while(startIndex<=endIndex){
			mid= (startIndex+endIndex)/2;
			if(search == arrays[mid]){
				System.out.println("Element found at "+mid+" index");
				flag=1;
				break;
			}else if(search< arrays[mid])
				endIndex = mid-1;
			else
				startIndex = mid+1;
			
		}
		if(flag==0){
			System.out.println("Element not found");
		}
		sc.close();
	}

}
