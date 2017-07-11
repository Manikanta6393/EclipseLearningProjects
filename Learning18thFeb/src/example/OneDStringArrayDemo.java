package example;

import java.util.Scanner;

public class OneDStringArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students:");
		//System.a
		int size = sc.nextInt(); // picks up only integer value but not \n
		sc.nextLine(); // consumes \n
		String[] names = new String[size];
		for(int i=0;i<names.length;i++){
		     System.out.println("Enter name of student:" + (i+1));
		     names[i] = sc.nextLine();
		}
		System.out.println("Student Names...");
		for(int i=0;i<names.length;i++){
		     System.out.println(names[i]);
		}}

}
