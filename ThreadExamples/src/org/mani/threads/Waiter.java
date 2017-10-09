package org.mani.threads;

public class Waiter implements Runnable {
	
	private Message msg;
	
	public Waiter(Message m) {
		this.msg = m;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		synchronized(msg){
			try{
				System.out.println(name+" waiting to get notified.");
				msg.wait();
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(name+" got notified.");
			 System.out.println(name+" processed: "+msg.getMsg());
		}
	}

}
