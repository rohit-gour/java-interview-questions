package DataStructure.Company.Reputation.com;

public class MaximumSumArray {
    public static void main(String[] args) {
        int[] arr = {-1, 3, 7, 5, -2, -6, 9};
        
        System.out.println("Maximum sum is : "+getMaximumSumOfSubArray(arr));
    }

    private static int getMaximumSumOfSubArray(int[] arr) {
        int max = 0;
        int current = 0;
        for(int i=0;i<arr.length;i++){
            current =arr[i];
            if(current>max)
                max = current;
            if(current<0)
                current = 0;
        }
        return max;
    }
}
