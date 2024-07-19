package LeetCodeExample.ArraysExample;

public class PalendromeExample {

    public void getPalendrome(int x){

        String val = String.valueOf(x);
        System.out.println(val.charAt(0));
    }
    public static void main(String[] args){
        PalendromeExample palendromeExample = new PalendromeExample();
        int x = 121;
        palendromeExample.getPalendrome(x);
    }
}
