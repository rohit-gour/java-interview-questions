package DataStructure.ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

    //Create Two dimensional Array

    public void getTwoDimensional(){
        int[][] arr = new int [3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Please fill values");
        for (int row= 0; row <arr.length ; row++) {
            System.out.println("Checking arr[row].length values : "+arr[row].length);
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println("--------------");
        //fatching data from array
        for(int row= 0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
//            for(int col= 0;col <arr[row].length; col++){
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
        }
    }
    public static void main(String args[]){
TwoDArray twoDArray = new TwoDArray();
twoDArray.getTwoDimensional();
    }
}
