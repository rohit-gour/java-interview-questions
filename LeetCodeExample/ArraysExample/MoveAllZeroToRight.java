package LeetCodeExample.ArraysExample;

import java.util.Arrays;

public class MoveAllZeroToRight {

    public static void getSolution(int [] arr, int target){

        int temp = 0;
        int j=0;
        for(int i= 0;i< arr.length; i++){
            if(arr[i]!= target){

                temp = arr[j];
                arr[j] = arr[i];
                arr[i]= temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));



    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,0,0,7,12};
        int target = 0;
        getSolution(arr, target);
    }
}
