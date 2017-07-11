package threads;

public class DaemonThreadDemo implements Runnable{
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName());}
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread t1 = new Thread(new DaemonThreadDemo());
		Thread t2 = new Thread(new DaemonThreadDemo());
		t1.start(); t2.start();
		t1.setDaemon(true); t2.setDaemon(true);

		
		try{
			Thread.sleep(100);
		}catch(InterruptedException ioe){}
		System.out.println("End of main thread");
	}
}

