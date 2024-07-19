package WebSparrow_Question;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurence_Example {
    public static void main(String[] args){
        String word = "addjkrjjkncjknjoiehir";
        Map<Character, Integer> mapOfCharactor = new HashMap<>();

        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            mapOfCharactor.put(c, mapOfCharactor.getOrDefault(c,0)+1);
        }
        System.out.println(mapOfCharactor);
        /*for(Map.Entry<Character, Integer> entry : mapOfCharactor.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/

        Map<Character, Long> getList = word.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(getList);
    }
}
