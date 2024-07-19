package AirtelPreparation.Puzzle;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");


        for(String s : list){
            System.out.println(s);
            list.remove(1);
            list.add("Pineapple");
        }
    }
}
