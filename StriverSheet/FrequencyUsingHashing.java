package StriverSheet;

public class FrequencyUsingHashing {
    public static void main(String[] args) {
        String str = "ababdbnasb";
        int[] hash = new int[26]; // Array to store frequencies of 'a' to 'z'

        getSolution(str, hash);
    }
    public static void getSolution(String str, int[] arr){
        for(char c: str.toCharArray()){
            arr[c-'a']++;
        }

        for(int i=0;i<26;i++){
            if(arr[i]>0){
                System.out.println((char)(i+'a')+" : "+arr[i]);
            }
        }
    }
}
