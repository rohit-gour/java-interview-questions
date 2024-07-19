package Multithreading;

public class Consumer extends Thread {
    private final Box box;

    public Consumer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Consumer is consuming.");
                int toy = box.consume();
                if (toy == box.getMaxToys() - 1) {
                    break; // Stop after consuming the last toy
                }
            }
            System.out.println("Consumer has finished consuming.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
