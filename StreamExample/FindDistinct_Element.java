package StreamExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindDistinct_Element {
    public static void main(String[] args) {
        List<String> getList = Arrays.asList("Rohit", "Shubhm", "nihal",
                "yashansh","Rohit","deepak","nihal");

        //Code to print all the distinct element from the list
        //getList.stream().distinct().forEach(r-> System.out.println(r));

        String s = getList.stream().min(Comparator.comparing(String::length)).get();
        System.out.println(s);
    }
}
