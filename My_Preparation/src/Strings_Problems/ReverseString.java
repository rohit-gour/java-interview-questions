package Strings_Problems;

import java.util.Arrays;

public class ReverseString {

    public static void getSolution(char[] ch ){

        int start = 0;
        int end = ch.length-1;
        while (start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(ch));

    }
    public static void main(String[] args) {
        char[] ch = {'r','o','h','i','t'};
        getSolution(ch);
    }
}
