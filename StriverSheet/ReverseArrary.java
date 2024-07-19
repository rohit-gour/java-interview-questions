package StriverSheet;

import java.util.Arrays;

public class ReverseArrary {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        //Solution using two pointer approach
        /*
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        */

        //Solution using recurssion
        getSolution(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void getSolution(int[]arr, int start, int end){
        if(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            getSolution(arr, start+1, end-1);
        }
    }
}
