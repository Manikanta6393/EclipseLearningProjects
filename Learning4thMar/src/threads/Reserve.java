package threads;

class Reserve implements Runnable
{
	int available =1;
	int wanted;
	Reserve(int i) { wanted=i;}
	public synchronized void run()
	{
		System.out.println("Available Berths =  " + available);
		if(available>= wanted)
		{
			String name = Thread.currentThread().getName();
			System.out.println(wanted+" berths reserved for " + name);
			try{
				Thread.sleep(2000L);//wait for printing the ticket	
				available -= wanted;
			}
			catch(InterruptedException ie){}
		}
		else
			System.out.println("No berths available"); 
	} 
}