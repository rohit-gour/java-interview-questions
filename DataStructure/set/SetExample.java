package DataStructure.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

       String word = "ababc";
       Set<Character> charSet = new HashSet<>();
       int right = 0;

       for(int left= 0; left<word.length();left++){

           char c = word.charAt(left);
           if(!charSet.contains(c)) {
               charSet.add(c);
           }
           else if (charSet.contains(c)){
               charSet.remove(c);
               right++;
//               charSet.
           }
       }
    }
}
