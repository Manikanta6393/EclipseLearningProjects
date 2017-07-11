package multithread;

public class HelloThread extends Thread {
	public void run() { 
		System.out.println("Hello from a thread!"); 
	} 
	public static void main(String args[]) { 
		Thread obj = new HelloThread();
		obj.start(); 
	}
}

