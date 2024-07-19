package StringQuestions;

import java.util.HashMap;
import java.util.Map;

public class RomanToString_Ex {

    public static void getResult(Map<Character, Integer> data, String str){
        int value = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(i<str.length()-1 && data.get(str.charAt(i))< data.get(str.charAt(i+1))) {
                value -= data.get(str.charAt(i));
            }
            else
                value += data.get(str.charAt(i));
        }
        System.out.println(value);
    }

    public static void main(String[] args) {

        Map<Character, Integer> data = new HashMap<>();
        data.put('I', 1);
        data.put('V', 5);
        data.put('X', 10);
        data.put('L', 50);
        data.put('C', 100);
        data.put('D', 500);
        data.put('M', 1000);

        String str = "MCMXCIV";
        getResult(data, str);
    }
}
