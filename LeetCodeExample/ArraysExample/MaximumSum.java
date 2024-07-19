package LeetCodeExample.ArraysExample;

import java.util.Arrays;
import java.util.List;

public class MaximumSum {

    public static int findMaxSum(int[] nums, int k) {
        int n = nums.length;
        if (n < k || k <= 0) {
            throw new IllegalArgumentException("Invalid input: n should be greater than or equal to k, and k should be a positive number.");
        }

        int maxSum = 0;
        int currentSum = 0;

        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        maxSum = currentSum;

        // Slide the window and update the currentSum and maxSum
        for (int i = k; i < n; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args){
        int[] nums = {2, 1, 5, 1, 3, 2, 6};
        int k = 3;
        int maxSum = findMaxSum(nums, k);
        System.out.println("Maximum sum of " + k + " consecutive elements: " + maxSum);

    }
}
