package StriverSheet;

public class CheckSortedArrrray {
    public static void main(String[] args) {
        int[] arr ={9,8,7,6,5,4,3,2,1};

        if(arr[0]<arr[arr.length-1]){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    System.out.printf("Not a sorted array");
                }
            }
        }
        else{
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    System.out.printf("Not a sorted array");
                    return;
                }
            }
        }
    }
}
