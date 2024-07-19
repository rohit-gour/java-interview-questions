package LeetCodeExample.ArraysExample;

import java.util.Arrays;

public class MedianOfTwoSortedArray_Ex {

    public static void getMedian(int[] arr, int[] arr1) {

        int l1 = arr.length;
        int l2 = arr1.length;
        int[] newArray = new int[(l1 + l2)];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < l1 && j < l2 && k<=(l1+l2)/2) {
            if (arr[i] < arr1[j]) {
                newArray[k] = arr[i];
                i++;
                k++;
            }
            else {
                newArray[k] = arr1[j];
                j++;
                k++;
            }
        }
        while(i<l1 && k<=(l1+l2)/2){
            newArray[k++] = arr1[i++];
        }
        while(j<l2 && k<=(l1+l2)/2){
            newArray[k++] = arr1[j++];
        }
        if((l1+l2)%2==0){
            System.out.println((newArray[newArray.length-1]+newArray[newArray.length-2])/2);
        }
        else
            System.out.println(newArray[newArray.length-1]);
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 8, 17};
        int arr1[] = {5, 6, 7, 19, 21, 25};
        getMedian(arr, arr1);
    }
}
