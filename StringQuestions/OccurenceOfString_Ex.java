/*
package StringQuestions;

public class OccurenceOfString_Ex {
    public static void main(String[] args) {
        String s = "ram went to ramanagar with ram";
        String target = "ram";
int times = 0;
        int hasNo = target.hashCode();
        StringBuilder sb = new StringBuilder(s.substring(0,3));
        if(sb.toString().hashCode()==hasNo){
            times++;
        }
        int count = sb.length();
        while(count<s.length()){
            sb.append(s.charAt(count));
            sb.deleteCharAt(0);
            if(sb.toString().hashCode()==hasNo){
                times++;
            }
            count++;
        }
        System.out.println(times);
    }
}
*/
package StringQuestions;

public class OccurenceOfString_Ex {
    public static void main(String[] args) {
        String s = "ram went to ramanagar with ram";
        String target = "ram";
        int times = 0;
        int targetHash = target.hashCode();
        int targetLength = target.length();

        StringBuilder sb = new StringBuilder(s.substring(0, targetLength));
        if (sb.toString().equals(target)) {
            times++;
        }
        int count = targetLength;
        while (count < s.length()) {
            sb.append(s.charAt(count));
            sb.deleteCharAt(0);
            if (sb.toString().hashCode() == targetHash && sb.toString().equals(target)) {
                times++;
            }
            count++;
        }
        System.out.println(times);
    }
}

