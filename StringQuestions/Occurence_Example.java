package StringQuestions;

import java.util.HashMap;
import java.util.Map;

public class Occurence_Example {
    public static void main(String[] args) {
        String name = "RRRRohitGour";
        Map<Character, Integer> hashMap = new HashMap<>();

        for(int i=0;i<name.length();i++){
            char c = name.charAt(i);
            if(hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c)+1);
            }
            else
            hashMap.put(c, 1);
        }
        for (Map.Entry<Character, Integer> s: hashMap.entrySet()){
            System.out.println(s.getKey()+" "+s.getValue());
        }
    }
}
