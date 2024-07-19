package AirtelPreparation.Puzzle.Permutation;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        List<List<Integer>> result = new ArrayList<>();
        permute(arr, 0, result);
    }

    public static void permute(int[] arr, int start, List<List<Integer>> result){
        if(start==arr.length){
            List<Integer> temp = new ArrayList<>();
            for(int num: arr){
                temp.add(num);
            }
            result.add(temp);
            return;
        }

        for(int i=start;i<arr.length;i++){
            sweap(arr,start,i);
            permute(arr, start+1, result);
            sweap(arr, start, i);
        }
    }

    private static void sweap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
