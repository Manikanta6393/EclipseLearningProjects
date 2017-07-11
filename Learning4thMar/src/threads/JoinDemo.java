package threads;

public class JoinDemo implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is alive: "+Thread.currentThread().isAlive());
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			System.out.println("Interruptedd"); 
		}
		System.out.println("End of run() method"); 
	}
	public static void main(String args[]) throws Exception {
		Thread th = new Thread(new JoinDemo(),"MyThread");
		th.start(); 
		th.join();
		th.interrupt();
		
		System.out.println(th.getName()+" is alive: "+th.isAlive());     
	}}

