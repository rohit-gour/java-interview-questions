package LeetCode_Problem.ArrayQuestions;

import java.util.Arrays;

public class ThreeSum {

    public static void getResult(int[] arr, int target){

        int first = 1;
        int last = arr.length-1;
        for(int i =0; i<arr.length-2;i++){
            while(first<last){
                int sum = arr[i] + arr[first] + arr[last];
                if(sum == target){
                    System.out.println(Arrays.toString(new int[]{arr[i], arr[first] ,arr[last]}));
                    return;
                } else if (target>sum) {
                    first++;
                } else if (target<sum) {
                    last--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 9;
        getResult(arr, target);
    }
}
