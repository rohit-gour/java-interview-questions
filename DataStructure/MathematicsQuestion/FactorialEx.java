package DataStructure.MathematicsQuestion;

public class FactorialEx {

    public int getFactorial(int n){
        if(n==0)
            return 1;
        return (n*getFactorial(n-1));
    }

    public static void main(String[] args) {

        FactorialEx factorialEx = new FactorialEx();
        int no = factorialEx.getFactorial(5);
        System.out.println(no);

    }
}
