package AirtelPreparation.Puzzle;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s = "java";
        /*char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String st = new String(ch);
        System.out.println(st);*/
        getSolution(s);
    }
    public static void getSolution(String s){
        char[] ch = s.toCharArray();
        quickSort(ch, 0, ch.length-1);
    }
    public static void quickSort(char[] ch, int start, int end){

    }
}
