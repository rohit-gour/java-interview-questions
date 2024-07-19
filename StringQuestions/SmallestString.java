package StringQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class SmallestString {
    public static void main(String[] args) {
        List<String> getString = new ArrayList<>();
        getString.add("Rohit");
        getString.add("Deepak");
        getString.add("Nihal");
        getString.add("ab");

        String name = getString.stream().min(Comparator.comparing(String::length)).get();
        System.out.println(name);
//        List<String> minAll = getString.stream().collect(Collectors.groupingBy(String::length))
//                .entrySet().stream().min(Map.Entry.comparingByKey())
//                .map(Map.Entry::getValue).get();
//        System.out.println(Arrays.asList(minAll));
    }

}
