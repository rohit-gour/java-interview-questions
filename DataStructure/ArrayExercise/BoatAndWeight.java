package DataStructure.ArrayExercise;

public class BoatAndWeight {
    public static void main(String[] args) {
        int[] arr = {3,2,2,4,1,4};
        int days = 3;

        getLoad(arr, days);
    }
    public static void getLoad(int[] arr, int days){
        int min = 0;
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            min = Math.max(min, arr[i]);
            max = max+arr[i];
        }
        System.out.println("min : "+min+" and sum : "+max);

        while (min<max){
            int mid = (min+max)/2;
            int day = 1;
            int sum = 0;
            for(int weight: arr){
                if(sum+weight>mid){
                    day++;
                    sum = 0;
                }
                sum+=weight;
            }
            if(day>days){
                min = mid+1;
            }
            else
                max = mid;
        }
        System.out.println(min);
    }
}
