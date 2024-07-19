package LeetCode_Problem.ArrayQuestions;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void getSortedArray(int[] arr){

//          [ 1, 2, 2, 3, 4, 4, 4, 5]
        int pointer = 0;
        for(int i=1; i<arr.length;i++){

            if(arr[i]!= arr[i-1]) {
                pointer++;
                arr[pointer] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,4,5};
        getSortedArray(arr);
    }
}
