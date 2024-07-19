package LeetCode_Problem.ArrayQuestions;

import java.util.Arrays;

public class AddtwoNumbers {

    public static void getResult(int[]l1, int[] l2){

        String s = "";
        String s1 = "";

        for(int i = l1.length-1;i>=0; i--){
            s = s+ String.valueOf(l1[i]);
        }
        for(int i = l2.length-1;i>=0; i--){
            s1 = s1+ String.valueOf(l2[i]);
        }
        int sum = Integer.valueOf(s)+Integer.valueOf(s1);
        String result = String.valueOf(sum);
        int [] arr = new int[result.length()];
        for (int i = 0;i<arr.length;i++){
            arr[i] = result.charAt(i);
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] l1 = {2,4,3}, l2 = {5,6,4};
        getResult(l1, l2);
    }
}
