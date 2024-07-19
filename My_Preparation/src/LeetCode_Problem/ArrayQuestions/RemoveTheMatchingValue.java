package LeetCode_Problem.ArrayQuestions;

import java.util.Arrays;

public class RemoveTheMatchingValue {

    public static void getResult(int[] arr, int value){

        int pointer = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != value){
                pointer++;
                arr[pointer] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,2,4};
        getResult(arr,2);
    }
}
