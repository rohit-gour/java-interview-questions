package StreamExample;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {
        String s = "rohit is a good boy";

        s = s.toUpperCase();
        System.out.println(s);

        /*String a = Arrays.asList(s.split(" ")).stream()
                .map(st -> st.toUpperCase()
                        .charAt(0)+st.substring(1)).collect(Collectors.joining(" "));
*/
        String a = Arrays.stream(s.split(" ")).map(str -> new StringBuilder(str).reverse()).collect(Collectors.joining(" "));
        System.out.println(a);
    }
}
//String result = Arrays.asList(name.split(" "))
//        .stream()
//        .map(f ->f.toUpperCase()
//                .charAt(0)+f.substring(1)).collect(Collectors.joining(" "));
//        System.out.println(result);