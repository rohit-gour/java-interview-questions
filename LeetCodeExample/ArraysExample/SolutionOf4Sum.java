package LeetCodeExample.ArraysExample;

import java.util.*;

public class SolutionOf4Sum {
   /* public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 4) {
            return result;
        }

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            // Avoid duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {
                // Avoid duplicates for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Avoid duplicates for the third element
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        // Avoid duplicates for the fourth element
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
*/

    public static List<List<Integer>> getSolution(int [] nums, int target){

        Arrays.sort(nums);
        Set<List<Integer>> getResult = new HashSet<>();
        for(int i = 0; i<nums.length-3; i++){

            for(int j = i+1; j< nums.length-2; j++){

                int left = j+1;
                int right = nums.length-1;
                while(left< right){

                    int result = nums[i]+nums[j];
                    result += nums[left]+nums[right];
                    if(target == result){
                        getResult.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    }

                    if(result<target)
                        left++;
                    else
                        right--;

                }
            }
        }
        return new ArrayList<>(getResult);

    }
    public static void main(String[] args) {
        SolutionOf4Sum solution = new SolutionOf4Sum();
        int[] nums = {-3,-2,-1,0,0,1,2,3};
        int target = 0;

        System.out.println(getSolution(nums, target));


    }
}
