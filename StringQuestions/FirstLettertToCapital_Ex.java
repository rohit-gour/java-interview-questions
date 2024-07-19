package StringQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstLettertToCapital_Ex {
    public static void main(String[] args) {
        String name = "rohit is not a good boy!";

        //Simple way to do
//         name = Character.toUpperCase(name.charAt(0))+name.substring(1);
//        System.out.println(name);

        String result = Arrays.asList(name.split(" "))
                        .stream()
                .map(f ->f.toUpperCase()
                .charAt(0)+f.substring(1)).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
