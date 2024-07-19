package StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTheDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 1, 7);

        //Find the unique element
        List<Integer> list = numbers.stream().distinct().toList();
        System.out.println(list);

        //Find the duplicate element only
        List<Integer> duplicate = numbers.stream()
                .collect(Collectors.groupingBy(x ->x, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(y -> y.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(duplicate);
    }
}
