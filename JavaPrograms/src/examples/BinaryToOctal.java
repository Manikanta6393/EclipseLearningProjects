package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToOctal {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Binary number:");
		String num=input.readLine();
		int dec = Integer.parseInt(num, 2);
		System.out.println("Decimal Number: "+dec);
		
		String octalNumber = Integer.toOctalString(dec);
		System.out.println("OctalNumber: "+octalNumber);
	}

}
