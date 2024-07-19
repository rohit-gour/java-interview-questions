package Multithreading;

public class Producer extends Thread {
    private final Box box;

    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        try {
            while (box.getToyCount() < box.getMaxToys()) {
                System.out.println("Producer is producing.");
                box.produce();
            }
            System.out.println("Producer has finished producing.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
