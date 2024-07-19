package LeetCode_Problem;

public class RangeQuesstion {

    public static void getSolution(int[] arr){
        int n = arr.length;
        int sum = n*(n+1)/2;
        System.out.println(sum);

        for(int no: arr){
            sum -= no;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        int[] arr = {0,2};
        getSolution(arr);
    }
}
