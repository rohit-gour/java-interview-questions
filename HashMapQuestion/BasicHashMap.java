package HashMapQuestion;

import java.util.HashMap;
import java.util.Map;

public class BasicHashMap {
    public void justInsertAndRetrieve(){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nihal",25);
        hashMap.put("Rohit",25);
        hashMap.put("Rohit",26);
        hashMap.put("Nihal",25);
        hashMap.put("Rohit",25);
        hashMap.put("Rohit",26);

        //Fatching values from hashMap

//        for(String h: hashMap.keySet()){
//            System.out.println(name + " "+ hashMap.get(name));
//        }
    }
}
