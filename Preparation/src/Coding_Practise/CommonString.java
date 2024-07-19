package Coding_Practise;

import java.util.Arrays;
import java.util.Comparator;

public class CommonString {

    public static void getLongestPreFix(String [] arr){

        try {
            Arrays.sort(arr, String::compareTo);
            System.out.println(Arrays.toString(arr));
        }
        catch(Exception e){

        }
        finally {
            System.out.println("Rohit");
            return;
        }
    }
    public static void main(String[] args) {

        String[] arr = {"Appale","Appstore","AarmStrong"};
        getLongestPreFix(arr);
    }
}
