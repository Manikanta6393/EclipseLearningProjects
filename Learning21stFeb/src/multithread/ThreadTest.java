package multithread;


public class ThreadTest implements Runnable{

		public void run(){
			System.out.println(Thread.currentThread().getName());
		}

	public static void main(String[] args) {
		/*System.out.println(Thread.currentThread().getName());
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
*/	
	/*ExecutorService executor = Executors.newFixedThreadPool(3);
	for(int i=0;i<10;i++){
		ThreadTest t = new ThreadTest();
		executor.execute(t);
	}*/
		ThreadGroup tg1 = new ThreadGroup("Parent");
		ThreadTest t = new ThreadTest();
		Thread t1 = new Thread(tg1,t,"one");
		Thread t12 = new Thread(tg1,t,"two");
		Thread t123 = new Thread(tg1,t,"three");
		
		t1.start();t12.start();t123.start();
		tg1.list();
		
	
	}
}
