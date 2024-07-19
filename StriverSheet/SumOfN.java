package StriverSheet;

public class SumOfN {
    public static void main(String[] args) {
        int n = 5;
         int sum = print(n);
        System.out.println(sum);
    }
    public static int  print(int n){
        if(n==1)
            return 1;
        return n+print(n-1);
    }
}
