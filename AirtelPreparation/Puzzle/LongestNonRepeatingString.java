package AirtelPreparation.Puzzle;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingString {
    public static void main(String[] args) {
        String input = "abcabcdbb";
        String longestSubstring = findLongestNonRepeatingSubstring(input);
        System.out.println("The longest non-repeating substring is: " + longestSubstring);
    }

    private static String findLongestNonRepeatingSubstring(String input) {
        int len = input.length();

        int start = 0;
        int maxLength = 0;
        int startLongest = 0;
        Set<Character> set = new HashSet<>();

        for(int end=0;end<len;end++){
            char c = input.charAt(end);
            if(set.contains(c)){
                while(set.contains(c)){
                    set.remove(input.charAt(start));
                    start++;
                }
            }
            set.add(c);

            if(end-start+1>maxLength){
                maxLength = end-start+1;
                startLongest = start;
            }
        }
        return input.substring(startLongest, startLongest+maxLength);
    }
}
