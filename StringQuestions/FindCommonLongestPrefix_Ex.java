package StringQuestions;

import java.util.Arrays;

public class FindCommonLongestPrefix_Ex {

    public static void getresult(String[] list){
        //Take first string as reference
        String reference = list[0];

        //Run the for Loop till the length of String
        for(int i=0;i<reference.length();i++){
            char c = reference.charAt(i);
            for (int j = 1; j < list.length; j++) {
                // If out of bounds or character mismatch, return the common prefix
                if (i == list[j].length() || list[j].charAt(i) != c) {
                    System.out.println( reference.substring(0, i));
                    return;
                }
            }
        }
        System.out.println(reference);
    }

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight","a"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        getresult(strs);
    }
}
