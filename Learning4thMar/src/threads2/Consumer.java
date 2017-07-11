
package threads2;

//Consumer Thread
class Consumer extends Thread {
	private Item item;

	public Consumer(Item item) {
		this.item = item;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(500);
				item.getItem();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

