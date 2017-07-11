package threads2;

//Producer thread 
class Producer extends Thread {
  private Item item;
  int i;

  public Producer(Item item) {
      this.item = item;
  }
public void run() {
      while (true) {
          try {
//sleep() introduced to make producer slower than consumer
              Thread.sleep(1000);
              item.setItem(++i);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
}

