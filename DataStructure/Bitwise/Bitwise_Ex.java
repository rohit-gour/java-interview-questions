package DataStructure.Bitwise;

public class Bitwise_Ex {

    public static void getResult(int[] arr){

        int result = 0;
        for(int i=0;i<arr.length;i++){
            result  =+ result^arr[i];
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr = {1,5,4,1,5,4,8,8,9,9};
        getResult(arr);
    }
}
