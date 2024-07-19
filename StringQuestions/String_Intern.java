package StringQuestions;

public class String_Intern {
    public static void main(String[] args) {
        String s = "apple";
        String s1 = new String("apple").intern();
        System.out.println(s==s1);
    }
}
