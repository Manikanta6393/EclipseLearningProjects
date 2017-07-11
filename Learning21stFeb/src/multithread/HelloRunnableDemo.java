package multithread;

class HelloRunnableDemo {
	public static void main(String args[]) { 
		Runnable  obj  = new HelloRunnable();
		Thread t = new Thread(obj,"Mani");
		t.start();
		Runnable  obj2  = new HelloRunnable();
		Thread t2 = new Thread(obj2,"T");
		t2.start();
	}
}

