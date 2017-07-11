package testing;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
	String name;
	int age;
	public void incrementAge(){
		age++;
	}
	static int fun(int n){
		for(int i=0;i<=n;i++){
			fun(n-i);
		}
		System.out.println("Well done");
		return n;
	}
	
	public static void permutation(String str){
		permutation("",str);
	}

	private static void permutation(String prefix, String str){
		int n = str.length();
		if(n==0){
			System.out.println("Give String");
		}else{
			for(int i=0;i<n;i++){
				permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n));
			}
			
		}
		
	}
	public static void main(String[] args){
		
		permutation("Mani");
	}

}
