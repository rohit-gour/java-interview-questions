package Java.Thread;

public class BasicThread extends Thread {

   public void run(){

//           for (int i = 0; i < 5; i++) {
//               try{
//                   Thread.sleep(700);
//               } catch (InterruptedException e) {
//                   throw new RuntimeException(e);
//               }
//               System.out.println("i " + i);
//           }

       //Get the Thread name
//       Thread t = Thread.currentThread();
//       System.out.println(t.getName());

       for (int i = 0; i < 5; i++) {
           System.out.println(i);
       }
   }
    public static void main(String[] args) {
        BasicThread t = new BasicThread();
        BasicThread t1 = new BasicThread();
        t1.start();
        t1.start();

        t.setPriority(1);
        System.out.println(t1.getPriority());

        //Setting Thread name :-
//        Thread.currentThread().setName("rohit");
//        System.out.println(Thread.currentThread().getName());

//        try{
//            t.join(1000);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//            throw new RuntimeException(e);
//
//        }
//        t1.start();
//        System.out.println("This progeram belongs to Join");
    }
}
