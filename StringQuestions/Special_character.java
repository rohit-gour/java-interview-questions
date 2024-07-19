package StringQuestions;

public class Special_character {
    public static void main(String[] args) {
        String s = "R2!*o%^h'*i#t";
        String s1 = s.replaceAll("[a-zA-Z!]","");
        System.out.println(s1);
    }
}
