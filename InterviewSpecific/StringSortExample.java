package InterviewSpecific;

import java.util.Arrays;

public class StringSortExample {
    public static void main(String[] args) {
        String [] str = {"banana", "apple", "cherry", "date", "fruit"};
        Arrays.sort(str, (a,b)->a.compareTo(b));
        System.out.println(Arrays.toString(str));
    }
}
