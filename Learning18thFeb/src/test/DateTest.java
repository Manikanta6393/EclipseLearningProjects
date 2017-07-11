package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public final class DateTest {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat ("EE yyyy.MM.dd 'at' h:mm:ss:SSS a");
		String strDate = sdf.format(today);
		System.out.println("Current Date: " + strDate); 
		Random random = new Random();
		System.out.println(random.nextInt(10000));
		
}

}
