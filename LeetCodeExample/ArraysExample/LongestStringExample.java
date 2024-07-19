package LeetCodeExample.ArraysExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestStringExample {

    public void getLongestString(String s) {
        //"abcabcbb"
        char[] charArray = s.toCharArray();
        String output = "";
        int length = 0;

        for (int i = 0; i < charArray.length; i++) {
            output = output+ String.valueOf(charArray[i]);
            for (int j = i+1; j < charArray.length; j++) {

                if (j== charArray.length || charArray[i] == charArray[j]) {
                    int temp = output.length();
                    if(length < temp){
                        length = temp;
                    }
                    output="";
                    break;
                }
                else {
                    output = output+ String.valueOf(charArray[j]);
                }

            }

        }
        System.out.println("Longest String : " +length);
    }

    public static void main(String[] args) {
        String longestString = "abcabcbbqwerty";
        LongestStringExample longestStringExample = new LongestStringExample();
        longestStringExample.getLongestString(longestString);
    }
}
