package Strings_Problems;

public class DefiningIP {

    public static void getSolution(String s){
        /*String[] str = s.split("\\.");
        String s2 = "";
        for(int i=0;i<str.length;i++){
            s2 = s2+ str[i];
            s2 = s2+"[.]";
        }
        System.out.println(new String(s2.substring(0, s2.length()-3)));*/

        System.out.println(s.replace(".","[.]"));
    }

    public static void main(String[] args){
        String s = "1.1.1.1";
        getSolution(s);
    }
}
