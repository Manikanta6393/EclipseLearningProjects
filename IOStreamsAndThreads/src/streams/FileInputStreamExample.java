package streams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	
	public static void main(String[] args){
		try {
			System.out.println(new FileInputStream("E:/mani.txt").available());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
