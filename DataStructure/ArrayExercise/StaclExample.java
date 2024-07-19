package DataStructure.ArrayExercise;

import java.util.Stack;

public class StaclExample {
    public boolean check(String str){
        Stack<Character> values = new Stack<>();

        //Checking paranthesis

        for(char c: str.toCharArray()){
            if(c =='(' || c =='{'){
                values.push(c);
            } else if (c == ')' && !values.empty() && values.peek() == '(') {
                values.pop();
            } else if (c == '}' && !values.isEmpty() && values.peek() == '{') {
                values.pop();
            }
        }
       return values.isEmpty();
    }

    public static void main(String[] args) {
        StaclExample staclExample = new StaclExample();

        String str = "(({({)}))";
        System.out.println(staclExample.check(str));
    }
}
