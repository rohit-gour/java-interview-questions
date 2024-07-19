package LeetCode_Problem.ArrayQuestions;

public class TwoSum {

    public static void getResult(int[] arr, int target){
        int next = arr.length-1;
        for (int i = 0; i < arr.length; i++) {

            if(next> i && (arr[i]+arr[next] == target)){
                System.out.println(new int[]{arr[i],arr[next]});
            }
            next--;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 8;
        getResult(arr, target);
    }
}
