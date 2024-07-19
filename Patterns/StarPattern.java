package Patterns;

public class StarPattern {
    public static void main(String[] args) {
        int n=1;
        for(int i=0;i<4;i++) {
            while (n < 5) {
                System.out.print("*"+" ");
                n++;
            }
            System.out.println("");
            n=1;
        }
    }
}
