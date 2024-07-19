import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String []listOfString = new String[]{"Rohit", "Nihal", "Deepak"};
        System.out.println(Arrays.asList(listOfString));
        String s;
        for(String ts: listOfString){
            System.out.println(ts);
        }
    }
}