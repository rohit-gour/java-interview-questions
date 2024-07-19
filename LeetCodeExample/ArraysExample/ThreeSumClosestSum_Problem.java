package LeetCodeExample.ArraysExample;

import java.util.Arrays;

public class ThreeSumClosestSum_Problem {

    public static int getArrayList(int[] arr, int target) {
        int value = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target)
                    return sum;
                else if (sum < target) {
                    left++;
                } else
                    right--;
                int difference = Math.abs(sum - target);
                if (difference < value) {
                    result = sum;
                    value = difference;
                }
            }
        }
return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        int target = -40;
        int value = getArrayList(arr, target);
        System.out.println(value);
    }
}

