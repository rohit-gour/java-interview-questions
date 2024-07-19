package Strings_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_occurence {

    public static void calCount(String s){
        Map<Character, Long> count = new HashMap<>();
        count = s.chars().mapToObj(ch -> (char)ch).
                collect(Collectors.
                        groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);

    }

    public static void main(String[] args) {
        String s = "Rohit Gour";
        calCount(s);
    }
}
