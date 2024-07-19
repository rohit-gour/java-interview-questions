package InterviewSpecific;

import java.util.Arrays;

public class FindTheLongestString {
    public static void main(String[] args) {
        String [] str= {"Rohit","nana","Pooja","Vasuuuuu"};
//        String longest = "";
//        for(int i=0;i<str.length;i++){
//            if(str[i].length()>longest.length()){
//                longest = str[i];
//            }
//        }
        String longest = Arrays.stream(str).reduce((word1, word2) -> word1.length()>word2.length()?word1:word2).get();
        System.out.println(longest);
    }
}
