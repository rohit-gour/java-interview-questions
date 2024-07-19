package Java8_Example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStream_Example {
    public static void main(String[] args) {
        IntStream.of(10);
//        int [] arr = IntStream.rangeClosed(1,10).toArray();
        int[] arr = IntStream.iterate(1, i -> i*2).limit(5).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
