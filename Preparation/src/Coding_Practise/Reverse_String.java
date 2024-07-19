package Coding_Practise;

public class Reverse_String {

    public static void getReverseString(String s){
        //Simple way to solve aabove problem
            /*char[] ch = s.toCharArray();
            int start = 0;
            int end = ch.length-1;
            while(start<end){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        System.out.println(new String(ch));*/


//            String st = s.chars()
//                .mapToObj(c -> (char) c)
//                .collect(StringBuilder::new, StringBuilder::insert, StringBuilder::append)
//                .toString();

        String st = new StringBuilder(s).reverse().toString();
        System.out.println(st);

    }

    public static void main(String[] args) {
        String s =  "Rohit";
        getReverseString(s);
    }
}
