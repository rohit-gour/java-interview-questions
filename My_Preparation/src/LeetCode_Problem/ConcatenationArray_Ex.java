package LeetCode_Problem;

import java.util.Arrays;

public class ConcatenationArray_Ex {

    public static void getResult(int[] arr) {
        int[] newArray = new int[arr.length * 2];
        int n = arr.length;

        System.arraycopy(arr,0,newArray,0,n);
        System.arraycopy(arr,0,newArray, n,n);

        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        getResult(arr);
    }
}
