package DataStructure.ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class OneDArray {
    public void OperationOnarray(){

        Scanner sc = new Scanner(System.in);
/*
        System.out.println("Please enter array Size: ");
        int ArraySize = sc.nextInt();
        int [] arr = new int[ArraySize];

        System.out.println("Insert values");
        //Inserting values in Array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        arr[1] = 20;
        System.out.println(Arrays.toString(arr));

        //fatching values from array
//        for (int j : arr) {
//            System.out.print(j);
//        }
    }
    public static void main(String[] args) {
        OneDArray oneDArray = new OneDArray();
        oneDArray.OperationOnarray();

 */
        //Lets Create array off Sttring
        String[] arr = new String[3];
        arr[0] = "Rohit";
        arr[1] = "Nihal";
        arr[2] = "Deepak";

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        OneDArray oneDArray = new OneDArray();
        oneDArray.OperationOnarray();
    }
    }
