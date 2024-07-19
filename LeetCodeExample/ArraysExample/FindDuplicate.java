package LeetCodeExample.ArraysExample;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public static void main(String[] args) {
        int []arr = {1,1,1,3,3,4,3,2,4,2};
        boolean b = getResult(arr);
    }
    public static boolean getResult(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}
