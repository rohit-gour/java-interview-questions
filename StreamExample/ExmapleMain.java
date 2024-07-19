package StreamExample;

import LeetCodeExample.LinkedList.LinkedListExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExmapleMain {
    public static void main(String[] args){
        List<Customer> listOfCustomer = new ArrayList<>();
        listOfCustomer.add(new Customer("001"));
        listOfCustomer.add(new Customer("002"));
        listOfCustomer.add(new Customer("003"));

        Map<String, Customer> mapData = new HashMap<>();
        for(Customer c: listOfCustomer){
            mapData.putIfAbsent(c.getCustomerid(), c);
        }

        Map<String, Customer> getCustomer = listOfCustomer.stream().collect(Collectors.toMap(Customer::getCustomerid, Customer ->Customer));

        getCustomer.entrySet().forEach(m ->{
            System.out.println(m.getKey()+" = "+m.getValue());});
    }
}
