package LeetCode_Problem.ArrayQuestions;

public class containerWithmostWater {

    public static void getResult(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int sum = 0;

        while(start<end){
            int minHeight = Math.min(arr[start], arr[end]);
            int width = end-start;
            sum = Math.max(sum, minHeight*width);
            if(arr[start]>arr[end])
            {
                end--;
            }
            else
                start++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        getResult(arr);
    }
}
