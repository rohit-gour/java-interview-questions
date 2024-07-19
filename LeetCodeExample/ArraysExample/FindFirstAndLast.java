package LeetCodeExample.ArraysExample;

import java.util.Arrays;

public class FindFirstAndLast {

    private static void getFirstAndLast_Target(int[] arr, int target) {

        int result[] = new int[2];
        result[0] = findFirst(arr, target);
        result[1] = findlast(arr, target);

        System.out.println(Arrays.toString(result));
    }
    public static int findFirst(int [] arr, int target){

        int index = 0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]==target){
                index = i;
                break;
            }
        }
        return index;
    }

    public static int findlast(int [] arr, int target){

        int index = 0;
        for(int i= arr.length-1; i>=0;i--)
        {
            if(arr[i]==target){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {

        int []arr = {5,7,7,8,8,10};
        int target = 8;
        getFirstAndLast_Target(arr, target);

    }
}
