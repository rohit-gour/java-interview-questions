/*
package AirtelPreparation.Puzzle;

public class FindMissingNo {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4,5, 6, 7};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
//            sum += arr[i];
            sum = sum^arr[i];
        }
        */
/*System.out.println(sum);

        int len = arr.length+1;
        int naturalSum = (len*(len+1))/2;*//*


//        System.out.println(naturalSum-sum);
        System.out.println(sum);
    }
}
*/
package AirtelPreparation.Puzzle;

public class FindMissingNo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5, 6, 7, 8};
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing Number: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int xorAll = 0;
        int xorArr = 0;

        for (int i = 1; i <= n; i++) {
            xorAll = xorAll ^ i;
        }

        for (int num : arr) {
            xorArr = xorArr ^ num;
        }

        return xorAll ^ xorArr;
    }
}

