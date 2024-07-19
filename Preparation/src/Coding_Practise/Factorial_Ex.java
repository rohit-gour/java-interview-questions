package Coding_Practise;

public class Factorial_Ex {
    public static void main(String[] args) {

        int no = 5;
        int result = 1;
        for(int i = no;i>0;i--){
            result = result*i;
        }
        System.out.println(result);

    }
}
