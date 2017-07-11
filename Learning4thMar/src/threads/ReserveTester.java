package threads;

class ReserveTester{
	public static void main(String [] args){
		Reserve obj =  new Reserve(1);
		//Attach first thread to the object
		Thread t1 = new Thread(obj);
		//Attach second thread to the same object
		Thread t2 = new Thread(obj);
		t1.setName("first person");
		t2.setName("second person");
		//send request to berths
		t1.start();
		t2.start();
	}
}

