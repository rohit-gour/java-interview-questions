package Coding_Practise;

import java.util.HashMap;

public class JavaCodeToFindSumOfTwoNo {
    public static void main(String[] args) {
        int sum = 10;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int remainder = sum - arr[i];
            if(map.containsKey(remainder)){
                int index  = map.get(remainder);
                System.out.println("We got"+index+"and "+i);
                return;
            }
            else
                map.put(arr[i], i);
        }
        System.out.println("Sum value is not exists!!");
    }
}
