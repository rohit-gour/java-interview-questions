package WebSparrow_Question;

import java.util.*;

import static WebSparrow_Question.Smallest_String.getSmallestString;

public class Smallest_String {

    //Code to find the smallest String using stream
    public static void getSmallestString(List<String> list){
        String getName = list.stream().min(Comparator.comparing(String::length)).get();
        System.out.println(getName);

        String name = Collections.min(list,Comparator.comparing(String::length));
        System.out.println("Name of name: "+name);
    }

    public static void main(String[] args) {
        List<String> languageList = new ArrayList<>();
        languageList.add("JAVA");
        languageList.add("Python");
        languageList.add("C++");
        languageList.add("DataStructure");
        languageList.add("C");

        getSmallestString(languageList);
    }
}
// List<String> books = Arrays.asList("Gaban", "Ramayan", "Bhagavat Gita", "Wings Of Fire", "Godan");