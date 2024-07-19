package Coding_Practise;

import java.util.Arrays;

public class MergeTwoSorted_Ex {
    //Merge two sorted arrays into a single sorted array.

    public static void getSortedArray(int [] arr, int[] arr1){

        int a = 0;
        int b = 0;
        int c = 0;

        int[] arr2 = new int[arr.length+arr1.length];
        while(a<arr.length && b< arr1.length) {
            if(arr[a]<=arr1[b]){
                arr2[c++] = arr[a++];
            }
            else {
                arr2[c++] = arr1[b++];
            }
        }
        while(a<arr.length){
            arr2[c++] = arr[a++];
        }
        while(b<arr1.length){
            arr2[c++] = arr1[b++];
        }
        System.out.println(Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int[] arr1 = {2,4,6,9,11};

        getSortedArray(arr, arr1);
    }
}
