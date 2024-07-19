import java.util.Formatter;

public class Formatting_Example {
    public static void main(String[] args) {
        String name = "Rohit";
        int age = 25;

        String detail = new Formatter().format("My name is %S and my age is %d", name, age).toString();
        System.out.println(detail);
    }
}
