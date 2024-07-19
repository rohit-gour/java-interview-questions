package Strings_Problems;

import java.util.stream.IntStream;

public class IntArrayToString_Ex {

    public static void printToString(int[] arr){
        IntStream.of(arr).mapToObj(num -> ""+num).forEach(System.out::print);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printToString(arr);
    }
}
