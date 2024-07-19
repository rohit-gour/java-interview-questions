package InterviewSpecific;

public class SweapTwoStringWithoutUsingThirdVariable {
    public static void main(String[] args) {
        String first = "Rohit";
        String second = "Gour";

        first = first+second;
        second = first.substring(0,first.length()-second.length());
        first = first.substring(second.length(), first.length());

        System.out.println("First: "+first+" Second: "+second);
    }
}
