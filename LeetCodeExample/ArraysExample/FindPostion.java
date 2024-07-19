package LeetCodeExample.ArraysExample;

public class FindPostion {

    public static void getPositionindex(int []nums, int target){
    int r = 0;
    int left = 0;
    int right = nums.length - 1;
        while(left<=right)

    {
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            System.out.println(mid);
        } else if (target > nums[mid]) {
            left = mid + 1;
        } else
            right = mid - 1;
    }
        System.out.println(left);
}
    public static void main(String[] args) {
        int []arr = {3,3,5,6};
        int target = 2;
        getPositionindex(arr, target);
    }
}
