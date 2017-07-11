package threads;

class Worker implements Runnable {
	private volatile int count=0;
	public void increment(){
		count++;
	} 
	public void run(){   
		for(int i=0;i<10;i++)
			increment();
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){}      
		System.out.println("Count =" + count);
	}
	public static void main(String [] args) throws InterruptedException{
		Worker obj = new Worker();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.start();
		t2.start();
	}
}

