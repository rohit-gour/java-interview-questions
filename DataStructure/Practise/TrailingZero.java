package DataStructure.Practise;

public class TrailingZero {
    public static void main(String[] args) {
        int n=12;
        int result = 0;
        for (int i=5;i<=n; i=i*5){
            result = result+n/i;
        }
        System.out.println(result);
    }
}
