package StringQuestions;

public class AlphaNumeric {
    public static void main(String[] args) {
        String s = "tree";
        int temp = 96;
        String finalString=new String();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int value = (int)c;
            int printable = value-temp;
            for(int j=1;j<=printable;j++){
                finalString+=c;
            }
        }
        System.out.println(finalString);
    }
}
