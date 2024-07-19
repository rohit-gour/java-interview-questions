package LeetCode_Problem;

import java.util.HashMap;
import java.util.Map;

public class NoOfGoodPair {

    public static void getresult(int[] arr) {

    Map<Integer, Integer> getMap = new HashMap<>();
    int count =0;
    for(int freq: arr){
        int freqe = getMap.getOrDefault(freq,0);

        count+= freqe;
        getMap.put(freq, freqe+1);
    }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1,1,3};

        getresult(arr);
    }
}
