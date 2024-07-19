package BitWise_Operators;

public class MultipleOf2 {

    public static boolean getNo(int j){

        if (j==0) {
            System.out.println("I should not be Zero!");
            return false;
        }
        long i = (long)j;
        return (i & (-i)) == i;
    }
    public static void main(String[] args) {
        int i = 8;
       boolean c =  getNo(i);
        System.out.println(c);
    }
}
