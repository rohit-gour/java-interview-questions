package Coding_Practise;

public class Palendrome {

    public static void getPalendrome(String i){
        /*String s = String.valueOf(i);
        String st = new StringBuilder(s).reverse().toString();
        if(s.equals(st)){
            System.out.println("No is palendrom!");
        }*/

        int start = 0;
        int end = i.length()-1;
        while(start<end){
            if(i.charAt(start)!= i.charAt(end)){
                System.out.println("Not a Palendrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("palendrome!!");

    }

    public static void main(String[] args) {
        String i = "Rohit";
        getPalendrome(i);
    }
}
