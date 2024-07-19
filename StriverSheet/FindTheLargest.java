package StriverSheet;

public class FindTheLargest {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,12,5,4};

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
