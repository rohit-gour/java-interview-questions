package InterviewSpecific;

import java.util.Arrays;

public class SamecharacterStartAndEnd {
    public static void main(String[] args) {
        String str[] = {"werw","rregf","abcda"};
        Arrays.stream(str).filter(s -> s.length()>0 && s.endsWith(String.valueOf(s.charAt(0)))).forEach(System.out::println);
    }
}
