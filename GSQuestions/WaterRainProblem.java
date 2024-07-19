package GSQuestions;

import java.util.Stack;

public class WaterRainProblem {
        public static int[] nextGreaterElementToRight(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                    int index = stack.pop();
                    result[index] = nums[i];
                }
                stack.push(i);
            }

            while (!stack.isEmpty()) {
                int index = stack.pop();
                result[index] = -1; // If no greater element to the right
            }

            return result;
        }

        public static void main(String[] args) {
            int[] nums = {4, 5, 2, 10, 8};
            int[] result = nextGreaterElementToRight(nums);

            System.out.println("Next Greater Element to Right:");
            for (int i : result) {
                System.out.print(i + " ");
            }
        }
    }

