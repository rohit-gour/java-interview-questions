package DataStructure.Company.Veriant;

import java.util.ArrayList;
import java.util.List;

public class StringRentCount {
    public static void main(String[] args) {
        String s = "*1 Rental $70,000Shopping  $299. Expenses $800 . House$2,00,000.";
        getSolution(s);
    }

    public static void getSolution(String s){
        s = s.replaceAll(",","");
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            String value = "";
            if(s.charAt(i)=='$'){

                while(Character.isDigit(s.charAt(i+1))){
                    value = value+ s.charAt(i + 1);
                    i++;
                }
                if(!value.isBlank()){
                    list.add(Integer.parseInt(value));
                }
            }
        }
        System.out.println("Sum : "+list.stream().reduce((x,y)-> x+y).get());
    }
}
