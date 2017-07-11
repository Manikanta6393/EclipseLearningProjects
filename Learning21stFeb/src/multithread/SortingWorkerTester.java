package multithread;

import java.util.ArrayList;
import java.util.List;
import java.security.SecureRandom;

public class SortingWorkerTester {
	public static void main(String[] args) throws InterruptedException{
		List<Integer> list = new ArrayList<>();

		for(int i=1;i<=10;i++){
			list.add(new SecureRandom().nextInt());
		}
		System.out.println(list);
		long start= System.currentTimeMillis();
		Thread t= new Thread(new SortingWorker(list));
		t.start();
		t.join();
		System.out.println("Time elapsed: " + (System.currentTimeMillis()-start));
		System.out.println(list);
	}
}

