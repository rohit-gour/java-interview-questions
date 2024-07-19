package StriverSheet;

public class ReverseDigit {
    public static void main(String[] args) {
        int n = 123456;

        /*String s ="";
        while(n>0){
            s+=n%10;
            n = n/10;
        }
        System.out.println(s);*/

        //Optimal approach
        int after = 0;
        while(n>0){
            int a = n%10;
            after = after*10+a;
            n = n/10;
        }
        System.out.println(after);
    }
}
