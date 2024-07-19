package StringQuestions;

import java.util.Stack;

public class ClearDigitsFromString {
    public static void main(String[] args) {
        String s = "cb34";

//        int count = s.length();
        /*StringBuilder sb = new StringBuilder(s);
        for(int i=1;i<sb.length();i++){
            if(Character.isDigit(sb.charAt(i))){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                i -=2;
                if (i < 0) {
                    i = -1; // Ensure `i` does not go below 0
                }
            }
        }
        System.out.println(sb.toString());*/

        //Second approach using Set
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                ch.pop();
            } else {
                ch.add(s.charAt(i));
            }
        }
        System.out.println(String.valueOf(ch.toString()));

    }
}
/*
package StringQuestions;

public class ClearDigitsFromString {
    public static void main(String[] args) {
        String s = "cb34";

        StringBuilder sb = new StringBuilder(s);
        for (int i = 1; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                sb.deleteCharAt(i); // Remove the digit
                sb.deleteCharAt(i - 1); // Remove the corresponding left position char
                i -= 2; // Move the index back by 2 to recheck after deletions
                if (i < 0) {
                    i = -1; // Ensure `i` does not go below 0
                }
            }
        }
        System.out.println(sb.toString());
    }
}
*/
