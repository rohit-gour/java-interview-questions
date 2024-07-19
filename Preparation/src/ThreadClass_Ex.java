public class ThreadClass_Ex implements Runnable{

    //Using Runnable interface
    @Override
    public void run() {
        System.out.println("Rohit");
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        ThreadClass_Ex threadClassEx = new ThreadClass_Ex();
        System.out.println(Thread.currentThread());

        Thread t = new Thread(threadClassEx);

        t.start();
    }
}
