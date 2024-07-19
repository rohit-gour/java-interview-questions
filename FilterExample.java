import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        int[] arr = {2,12,45,45,451,233123,454,543,2123,121,2};
        List<Integer> list = Arrays.asList(2,12,45,45,451,233123,454,543,2123,121,2);
//        List<Integer> listOfEven = Arrays.stream(arr).filter(check -> check%2==0).collect(Collectors.toList());
//        listOfEven.stream().forEach(U-> System.out.println(U));
    }
}
