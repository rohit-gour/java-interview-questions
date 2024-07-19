package Multithreading;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        Box box = new Box();

        Producer producer = new Producer(box);
        Consumer consumer = new Consumer(box);

        producer.start();
        consumer.start();

        try {
            producer.join(); // Wait for the producer thread to finish
            consumer.join(); // Wait for the consumer thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Production and consumption finished.");
    }
}
