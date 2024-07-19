package LeetCodeExample.ArraysExample;

public class MaximumWaterStorage {

    public static int getMaximumWaterStorage(int[] arr){
        int max =0;
        int start = 0;
        int end = arr.length-1;
        int minHeight = arr[end];

        while(start<end){
            minHeight = Math.min(arr[start], arr[end]);
            int Calculatemax = minHeight*(end-start);
            max = Math.max(Calculatemax, max);
            if(arr[start]>arr[end])
                end--;
            else
                start++;
        }

        return max;
    }
    public static void main(String[] args) {

        int[] arr = {6,4,2,5,4,6,1,3,5};
        System.out.println(getMaximumWaterStorage(arr));
    }
}
