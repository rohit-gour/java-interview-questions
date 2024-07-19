package LeetCodeExample.ArraysExample;

import java.util.Arrays;

public class MergeTwoSortedArray_Ex {

    public static void getrotateArray(int [] arr, int []arr1){

        int i=0;
        int j=0;
        int k = 0;
        int[] newArray = new int [arr.length+ arr1.length];

        while (i < arr.length || j < arr1.length) {
            if (i < arr.length && ((j >= arr1.length) || (arr[i] > arr1[j]))) {
                newArray[k++] = arr[i++];
            } else {
                newArray[k++] = arr1[j++];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }


    public static void main(String[] args) {
        int[] arr = {15,6,2};
        int[] arr1 = {13,9,7,6,1};

        getrotateArray(arr, arr1);
    }
}
