package HashMapQuestion;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMap {
    public void basicMethod(){
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Rohit",25);
        map.put("Nihal",28);
        map.put("Vasu",23);

        //fatching linkedMap values;

        for(Map.Entry<String, Integer> m: map.entrySet()){

            System.out.println("Name: "+m.getKey()+"   Age: "+m.getValue());
        }

    }
}
