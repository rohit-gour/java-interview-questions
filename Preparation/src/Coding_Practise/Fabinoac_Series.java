package Coding_Practise;

public class Fabinoac_Series {

    public static int getSeries(int no){
        if(no<=1){
            return no;
        }
        return 1;
    }


    public static void main(String[] args) {
        int no = 10;
        int sum = getSeries(no);
    }

}
