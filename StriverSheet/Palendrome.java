package StriverSheet;

public class Palendrome {
    public static void main(String[] args) {
        int n = 451254;

        int reverse = getReversed(n);
        System.out.println(n==reverse);
    }
    public static int getReversed(int n){
        int r = 0;
        while(n>0){
            r = (r*10)+n%10;
            n = n/10;
        }
        return r;
    }
}
