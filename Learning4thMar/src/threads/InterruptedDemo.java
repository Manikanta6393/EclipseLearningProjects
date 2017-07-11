package threads;

public class InterruptedDemo extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		/*for(int i=1;i<=3;i++){
			if(Thread.interrupted()){
				System.out.println(this.isInterrupted());
				System.out.println("Code for interrupted thread");
			}
			else{
				System.out.println(this.isInterrupted());
				System.out.println("Code for normal thread");
			}
		}*/
	}
	public static void main(String [] args){
		InterruptedDemo t1= new InterruptedDemo();
		InterruptedDemo t2= new InterruptedDemo();
		t1.setPriority(1);
		t2.setPriority(5);
		t1.start();
		t2.start();
		//t1.interrupt();
	}
}

