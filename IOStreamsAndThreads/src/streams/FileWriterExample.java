package streams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	
	public static void main(String[] args){
		try {
			FileWriter fw = new FileWriter("E:/mani.txt");
			fw.write("Hey");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
