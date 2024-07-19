package DataStructure.Practise;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise {

    void getLongestString(String s){
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
         for(int right = 0; right<s.length(); right++){
             while (!set.add(s.charAt(right))){
                 set.remove(s.charAt(left++));
             }
             max = Math.max(max, right-left+1);
         }
        System.out.println(max);
    }
    public static void main(String[] args) {

        Exercise e = new Exercise();
        e.getLongestString("ababcabcde");

    }
}
