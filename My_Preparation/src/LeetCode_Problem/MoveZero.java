package LeetCode_Problem;

import java.util.Arrays;

public class MoveZero {

    public static void getResult(int[] arr){
        int []ab = Arrays.stream(arr)
                .boxed()  // Convert int to Integer
                .sorted((a, b) -> a.equals(0) ? 1 : 0)  // Move zeros to the end
                .mapToInt(Integer::intValue)  // Convert back to int
                .toArray();
        System.out.println(Arrays.toString(ab));
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,4,6,4,6,0};
        getResult(arr);
    }
}
