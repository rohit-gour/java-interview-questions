package LeetCodeExample.ArraysExample;

import java.util.Arrays;

public class FourSum_Example {

    public static void getFourSum(int [] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        for(int i=0;i<arr.length-1; i++){
            for(int j = i+1; j<arr.length;j++){
                int result = arr[i]+arr[j];





                if(result == target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,16,4,23,7,14,4,34,9,3,15,35};
        int target = 9;
        getFourSum(arr, target);
    }
}
/*
0 6
        1 5
        2 4
        3 4*/
