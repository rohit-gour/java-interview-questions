package LeetCodeExample.ArraysExample;

public class Missing_NoExample {

    public static void getMissing(int [] arr, int target){
        int temp =0;
        int sum = target*(target+1)/2;
        for(int i: arr){
            temp+=i;
        }
        System.out.println(sum-temp);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int target = 5;

        getMissing(arr, target);
    }
}
