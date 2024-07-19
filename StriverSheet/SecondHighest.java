package StriverSheet;

public class SecondHighest {
    public static void main(String[] args) {
        //Java code to print the second highest no from array
        int []arr = {0,1,2,3,4,5,6,7,9,8,76};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i]>secondMax) {
                secondMax = arr[i];

            }
        }
        System.out.println("Second highest : "+secondMax);
    }
}
