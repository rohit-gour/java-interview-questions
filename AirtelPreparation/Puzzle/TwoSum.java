package AirtelPreparation.Puzzle;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,1,8,10};
        int target = 15;
        getSolution(arr, target);
    }
    public static void getSolution(int[] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem = target-arr[i];
            if(map.containsKey(rem)){
                System.out.println(i+" : "+map.get(rem));
            }
            map.put(arr[i], i);
        }
    }
}
