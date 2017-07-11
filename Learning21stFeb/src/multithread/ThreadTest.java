package multithread;

public class ThreadTest extends Thread{

	//	public void run(){
	//		System.out.println(Thread.currentThread().getName());
	//	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		(new Thread(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		}).start();

		new Thread(new Runnable(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		}).start();
	}


}
