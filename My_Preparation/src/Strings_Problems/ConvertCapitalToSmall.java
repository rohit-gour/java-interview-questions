package Strings_Problems;

public class ConvertCapitalToSmall {

    public static void getResult(String s){

        String result = " ";
        for(int i=0;i<s.length();i++){
            int value = (int)s.charAt(i);
            if(value<=90 && value>=65){
                value += 32;
                result += (char)value;
            }
            else {
                result += s.charAt(i);
            }

        }
        System.out.println(result);

    }
    public static void main(String[] args) {

        String s= "Rohit";
        getResult(s);
    }
}
