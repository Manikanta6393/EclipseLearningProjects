package threads2;

public class Item {
	private int value;
	boolean valueSet = false;

	public synchronized void setItem(int n) throws InterruptedException 
	{
		if (valueSet) {
			// Wait for consumer to consume an item
			wait();
		}

		value = n;
		System.out.print("Producer setting item: " +value);
		notify();
		valueSet = true;
	}

	public synchronized void getItem() throws InterruptedException
	{
		if (!valueSet) {
			// Wait for producer to produce an item
			wait();
		}

		System.out.println(" ->  Consumer getting item: " + value);
		notify();
		valueSet = false;
	}
} // end of class

