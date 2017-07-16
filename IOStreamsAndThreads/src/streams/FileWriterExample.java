package streams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args){
		try {
			FileWriter fw = new FileWriter("E:/mani.txt",true);
			fw.write("Hey Mani");
			fw.flush();
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
