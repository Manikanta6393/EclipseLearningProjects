package threads;

public class DeadLock {
	public static  String str1 = "Welcome";
	public static  String str2 = "Than Q";

	public static void main(String[] a) {
		Thread myThread = new MyThread();
		Thread yourThread = new YourThread();

		myThread.start();
		yourThread.start();
	}
	//static nested class
	private static class MyThread extends Thread {
		public void run() {
			synchronized (str1) {
				System.out.println( this.getName()+" holds lock on object str1 : " + str1);
				try {
					Thread.sleep(10);
				}
				catch (InterruptedException e) {
				}
				System.out.println(this.getName()+" waiting for lock on object str2");
				synchronized (str2) {
					System.out.println(this.getName()+" holds lock on objects str1, str2"); 
				} // end of synchronized block on str1I
			} // end of synchronized block on str1
		} // end of run method
	} // end of MyThread  class
	private static class YourThread extends Thread {
		public void run() {
			synchronized (str2) {
				System.out.println(this.getName()+" holds lock on object str2 : " + str2);
				try {
					Thread.sleep(10);
				}
				catch (InterruptedException e) {}
				System.out.println(this.getName()+" waiting for lock on object str1");
				synchronized (str1) {
					System.out.println(this.getName()+"holds lock on objects str1, str2"); 
				} // end of synchronized block on str1
			} // end of synchronized block on str2
		} // end of run method
	} // end of YourThread class
} // end of DeadLockDemo
