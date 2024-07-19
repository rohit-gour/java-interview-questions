package InterviewSpecific;

public class StringReverse {
//    public void reverseString( String str){
//        StringBuilder stringBuilder = new StringBuilder();
//        char [] array = str.toCharArray();
//        for(int i = array.length-1; i>=0; i--){
//            stringBuilder.append(array[i]);
//        }
//        System.out.println(stringBuilder.toString());
//    }

    public static void main(String[] args) {
        String input = "This is Aslam";
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = input.split("\\s");
        String output = "";

        for (int i = 0; i < words.length; i++) {
//            String reversedWord = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                stringBuilder.append(words[i].charAt(j));
                stringBuilder.append(" ");
//                reversedWord += words[i].charAt(j);
            }
//            output += reversedWord + " ";
        }

        System.out.println("Input string: " + input);
//        System.out.println("Output string: " + output.trim());
        System.out.println(stringBuilder.toString());
    }
}
