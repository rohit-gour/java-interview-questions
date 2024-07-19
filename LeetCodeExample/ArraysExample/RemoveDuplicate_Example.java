package LeetCodeExample.ArraysExample;

import java.util.Arrays;

public class RemoveDuplicate_Example {

    public static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= val){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,-2,0,0,3,0,4,2};
        System.out.println(Arrays.toString(arr));
        int i = removeElement(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
