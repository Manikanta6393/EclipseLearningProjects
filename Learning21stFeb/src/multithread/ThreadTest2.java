package multithread;

public class ThreadTest2 extends Thread{
	public void run(){
		System.out.println("Started");
	}
	
	public static void main(String[] args){
		ThreadTest2 t= new ThreadTest2();
		t.start();
	}

}
