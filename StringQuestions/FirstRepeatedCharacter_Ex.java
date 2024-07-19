package StringQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedCharacter_Ex {

    public static void getFirstReapeatedCharacter(String name){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<name.length();i++){
            char c = name.charAt(i);
            if(map.containsKey(c)){
                System.out.println("Reapeating Character: "+c);
                return;
            }
            else
                map.put(c, 1);
        }
    }

    public static void main(String[] args) {
        String name = "rhitgourr";
        getFirstReapeatedCharacter(name);
    }
}
