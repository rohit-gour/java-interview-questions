package WebSparrow_Question;

public class Switch_Example {
    public static void main(String[] args) {
        int result = getValue(2);
        System.out.println("Result: " + result);
    }

    static int getValue(int input) {
        return switch (200) {
            case 1 -> {
                System.out.println("Processing case 1");
                yield 10;
            }
            case 200 -> {
                System.out.println("Processing case 2");
                yield 20;
            }
            case 3 -> {
                System.out.println("Processing case 3");
                yield 30;
            }
            default -> {
                System.out.println("Processing default case");
                yield 0;
            }
            };
        }
}
