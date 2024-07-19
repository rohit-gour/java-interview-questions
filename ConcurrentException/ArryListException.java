package ConcurrentException;

import java.util.ArrayList;
import java.util.List;

public class ArryListException {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int count = 100;
        for(int i=0;i<5;i++){
            list.add(count++);
        }
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            list.remove(i);
        }
        System.out.println(list);
    }
}
