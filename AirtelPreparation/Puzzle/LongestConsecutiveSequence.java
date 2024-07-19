package AirtelPreparation.Puzzle;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    //Incomplete need to complete

    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        int count = longestConsecutive(arr);
        System.out.println(count);
    }
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int max = 0;
        for(int i=0;i<nums.length-1;i++){
            count++;
            max = Math.max(count, max);
            if(nums[i]!=nums[i+1]){
                count = 0;
            }
        }
        return max;
    }
}
