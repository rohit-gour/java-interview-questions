package AirtelPreparation.Puzzle;

/*
public class RemoveCharFromString {
    public static void main(String[] args) {
        String s = "@@%%%%%##^^^#$#";
        int count = 3;

        getSolution(s, count);
    }

    public static void getSolution(String str, int count){
        int start = 0;
        int next = 0;
        String newOne = "";
        int c = 0;
        StringBuilder sb = new StringBuilder(str);
        while(next<sb.length()){
            if(c>=count && str.charAt(next)!= str.charAt(next+1)){
                sb.delete(start,next+1);
                next = start;
                c = 1;
            }
            if(str.charAt(start)!=str.charAt(next)){
                newOne = newOne+str.substring(start,next);
                start = next;
                next++;
                c = 1;
            }else {
                c++;
                next++;
            }
        }
        System.out.println(sb.toString());
    }
}
//Question. Remove >= 3 continuous characters from the input string.
//input: @@%%%%%##^^^#$# -> @@###$ -> @@$
//output: @@$*/

import java.util.Stack;

public class RemoveContinuousCharacters {
    public static void main(String[] args) {
        String input = "@@%%%%%##^^^#$#";
        String result = removeContinuousCharacters(input);
        System.out.println(result);  // Output: @@$
    }

    public static String removeContinuousCharacters(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                countStack.push(countStack.pop() + 1);
            } else {
                stack.push(c);
                countStack.push(1);
            }

            if (countStack.peek() >= 3 && s.charAt(i)!=s.charAt(i+1)) {
                stack.pop();
                countStack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            char c = stack.pop();
            int count = countStack.pop();
            for (int i = 0; i < count; i++) {
                result.insert(0, c);
            }
        }

        return result.toString();
    }
}

