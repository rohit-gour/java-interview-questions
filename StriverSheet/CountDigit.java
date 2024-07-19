package StriverSheet;

public class CountDigit {
    public static void main(String[] args) {
        int n = 123456;
        int count = getCount(n);
        System.out.println(count);
    }

    public static int getCount(int n){
        /*int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;*/
        int count = (int)Math.log10(n)+1;
        return count;
    }
}
