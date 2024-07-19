package DataStructure.MathematicsQuestion;

public class fabonacciEx {
    public static void main(String[] args) {
        int first=0;
        int second =1;

        int n=3;

        if(n>=1)
            System.out.print(first);
        if(n>=2)
            System.out.print(second);
        for(int i=1;i<=n;i++){
            int result = first+second;
            System.out.print(result);
            first = second;
            second = result;
        }
    }
}
