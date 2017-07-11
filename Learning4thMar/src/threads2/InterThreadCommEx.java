package threads2;

//Inter thread communication to solver producer-consumer problem
public class InterThreadCommEx {

public static void main(String[] args) {
    //Common item object shared by both Producer and Consumer
    Item item = new Item();
    Producer producer = new Producer(item);
    Consumer consumer = new Consumer(item);
    producer.start();
    consumer.start();
}
}
