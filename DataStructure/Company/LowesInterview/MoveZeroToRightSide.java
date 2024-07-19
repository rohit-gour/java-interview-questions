package DataStructure.Company.LowesInterview;

import java.util.Arrays;

public class MoveZeroToRightSide {
    public void letsDoIt(int [] arr){
        int count =0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count<n){
            arr[count++] = 0;
        }
    } 

    public static void main(String[] args) {
        int arr[] = {0, 2, 5, 0, -1, 5, 0, 8, 0, 0, 0, 8, 7};
        MoveZeroToRightSide moveZeroToRightSide = new MoveZeroToRightSide();
        moveZeroToRightSide.letsDoIt(arr);
        System.out.println(Arrays.toString(arr));
    }
}
