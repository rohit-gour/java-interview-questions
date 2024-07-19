package StringQuestions;

public class NihalsQuestion {

    public static void getFinalString(String first, String second){

        int s1 = 0, s2 = 0;
        String finalString = "";

        while(s1<first.length() || s2< second.length()){

            if(s1<first.length()) {
                finalString += first.charAt(s1++);
            }
            if(s2<second.length()) {
                finalString += second.charAt(s2++);
            }
        }
      /*  while (s1<first.length()){
            finalString += first.charAt(s1++);
        }
        while (s2<second.length()){
            finalString += second.charAt(s2++);
        }*/
        System.out.println(finalString);
    }
    public static void main(String[] args) {
        String first = "Abc";
        String second = "Pqrst";

        getFinalString(first, second);
    }
}
