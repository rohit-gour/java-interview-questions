package Coding_Practise;

public class Sliding_Window {

    public static void getMaxSum(int [] arr, int k){

        int maxSum = 0;
        int currentSum = 0;

        for(int i=0;i<k;i++){
            currentSum += arr[i];
        }
        System.out.println("Current sum: "+ currentSum);

        for(int i=k;i<arr.length;i++){
            currentSum += arr[i];
            currentSum -= arr[i-k];

            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Maximum sum of SubArray: "+maxSum);

    }

    public static void main(String[] args) {
        int[] arr = {2,9,31,-4,21,7};
        int k = 3;
        getMaxSum(arr, k);

    }

}
