package multithread;

import java.util.Collections;
import java.util.List;

public class  SortingWorker implements Runnable{
	List<Integer> list;

	public SortingWorker(List<Integer> list){
		this.list=list;
	}

	@Override
	public void run(){
		Collections.sort(list);
		try {
			Thread.sleep(10);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

