package Multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class Box {
    private static final int BOX_CAPACITY = 1;
    private final Queue<Integer> box = new LinkedList<>();
    private static final int MAX_TOYS = 5;
    private int toyCount = 0;

    public synchronized void produce() throws InterruptedException {
        while (box.size() == BOX_CAPACITY) {
            System.out.println("Box is full. Producer is waiting.");
            wait(); // wait if the box is full
        }
        if (toyCount < MAX_TOYS) {
            box.add(toyCount);
            System.out.println("Produced toy : " + toyCount);
            toyCount++;
            notifyAll(); // Notify all consumers
        }
    }

    public synchronized int consume() throws InterruptedException {
        while (box.isEmpty()) {
            System.out.println("Box is empty. Consumer is waiting.");
            wait(); // Wait if the box is empty
        }
        int toy = box.poll();
        System.out.println("Consumed toy : " + toy);
        notifyAll(); // Notify all producers
        return toy;
    }

    public int getToyCount() {
        return toyCount;
    }

    public int getMaxToys() {
        return MAX_TOYS;
    }
}
