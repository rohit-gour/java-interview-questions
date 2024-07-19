package AirtelPreparation.Puzzle;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int arr[] = {2,3,-2,0,4};
        int arr1[] = new int[arr.length];
        int count = 0;
        int product = 1;

        for(int i=0;i<arr.length;i++){
            product = product*arr[i];
            arr1[i] = product;
        }
        int result = Arrays.stream(arr1).boxed().sorted((a,b)->b-a).findFirst().get();
        System.out.println(result);
    }
}
