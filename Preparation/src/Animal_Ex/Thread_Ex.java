package Animal_Ex;

public class Thread_Ex extends Thread{

    public static void getData(){
        System.out.println("Rohit");
        System.out.println(Thread.currentThread());
    }

    public void run(){
        System.out.println("Thread from run method: "+Thread.currentThread());
    }
    public static void main(String[] args) {
        Thread_Ex t = new Thread_Ex();
        getData();
        t.start();
    }
}
