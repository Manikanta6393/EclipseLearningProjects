package threads;

public class Example1 extends Thread{
	public void run(){
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Example1 e1 = new Example1();
		e1.start();
		System.out.println(e1.isAlive());
	}

}
