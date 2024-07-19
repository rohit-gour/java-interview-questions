package Strings_Problems;

public class FinalVariable {

    public static void getsolution(String[] str){

       /* int x = 0;
        for(int i=0;i<str.length;i++){
            if("++X" == str[i] || "X++" == str[i]){
                x+=1;
            }
            else
                x-= 1;
        }
        System.out.println(x);*/


        int x = 0;
        for(String o : str) {
            char s = o.charAt(1);
            x += (44 - s);
        }
    }
    public static void main(String[] args) {
        String[] st = {"-rX","X++","X++"};
        getsolution(st);
    }
}
