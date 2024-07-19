package StringQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringToIntLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");

       /* List<Integer> list = strings.stream().map(String::length).toList();
        System.out.println(list);*/

        Map<Integer, List<String>> map = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }
}
