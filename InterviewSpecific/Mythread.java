package InterviewSpecific;

public class Mythread extends Thread{
    public void run(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();
    }
}
