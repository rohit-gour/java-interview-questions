package AirtelPreparation.Puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddAndEven {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 1, 8, 10, 7, 6};
        getSolution(arr);
    }
    public static void getSolution(int[] arr){
        Map<Boolean, List<Integer>> map= Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x -> x%2==0));
        System.out.println(map);
    }
}
