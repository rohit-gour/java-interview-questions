package StringQuestions;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        String s = "Apple";
        String s1 = "purple";

        methodCalling(s, s1);
    }
    public static void methodCalling(String s, String s1){
        StringBuilder sb = new StringBuilder();
        Set<Character> charSet = new HashSet<>();
        for(int i=0;i<s.length();i++){
            charSet.add(s.charAt(i));
        }
        System.out.println(charSet);

        for(int i=0;i<s1.length();i++){
            if(charSet.contains(s1.charAt(i))){
                sb.append(s1.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
