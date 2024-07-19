package StriverSheet;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    //Java code to find the highest and lowest frequency
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,8,7,6,5,4,3,4,2,3,4,5,6,7,8,7,6,5,4,3};
        getSolution(arr);
    }
    public static void getSolution(int []arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);

        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        int hNo = 0;
        int lNo = 0;

        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            int temp = m.getValue();
            if(temp>high){
                high = temp;
                hNo = m.getKey();

            }
            if (temp<low) {
                low = temp;
                lNo = m.getKey();
            }
        }
        System.out.println(hNo+" repeated most : "+high);
        System.out.println(lNo+" repeated most : "+low);
    }
}
