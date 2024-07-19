package DataStructure.Bitwise;

public class DecimalToBinary_Ex {

    //Method to convert no to Binary
    public static void getBinary(int n){
        String s = "";
        while(n>=1){

            //Keeping remainder
            int remainder = n%2;
            //Dividing n by 2
            n = n/2;
            s = (remainder)+s;
        }
        System.out.println(s);

        //Another method to convert binary to decimal
        getBinaryToDecimal(s);
    }
    public static void getBinaryToDecimal(String s){

        int powerOf2 = 1;
        int result = 0;
        for (int i = s.length()-1; i >=0 ; i--) {

            if(s.charAt(i)=='1'){
                result = result+ powerOf2;
            }
            powerOf2 = powerOf2*2;
        }
        System.out.println(result);
//        while
    }

    public static void main(String[] args) {
        int n = 2147148364;
        getBinary(n);
    }
}
