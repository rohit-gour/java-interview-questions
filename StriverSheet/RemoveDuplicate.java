package StriverSheet;

import java.util.Arrays;

public class RemoveDuplicate {
    //Remove duplicate elements from the sorted array

    public static void main(String[] args) {
        int []arr = {1,2,3,3,4,5,5,6,7,8};

        int start = 0;
        int []newOne = new int[arr.length];
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                newOne[start++] = arr[i-1];
            }
        }
        newOne[start] = arr[arr.length-1];
        System.out.println(Arrays.toString(newOne));
    }
}
