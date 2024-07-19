package Coding_Practise;

public class Demo {
    public static void staticMethod(){
        int x = 5;
        for(int i=0;i<x;i++){
            x++;
            if(i == 30000000){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {

        staticMethod();
        Thread t = new Thread();
    }
}
