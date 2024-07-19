package LeetCode_Problem.ArrayQuestions;

import java.util.Arrays;

public class ShuffleTheArray {

    public static void getSolution(int[] arr, int value){

        /*int temp = value;
        int[] arr1 = new int[arr.length];
        int i=0;
        int point = 0;
        while(i<value && temp<arr.length){
            arr1[point++] = arr[i++];
            arr1[point++] = arr[temp++];
        }*/

        int point = value;
        int temp = 0;
        while(point<value && value<arr.length){

        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int value = 3;

        getSolution(arr, value);
    }
}
