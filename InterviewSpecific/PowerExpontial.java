package InterviewSpecific;

public class PowerExpontial {
    public int check(int a, int b){
        if(b ==0){
            return 1;
        }
        else if (b>0){
            return a*check(a, b-1);
        }
        else {
            return 1/check(a, -b);
        }
    }
    public static void main(String [] args){
        int a = 2;
        int b = 3;
        PowerExpontial powerExpontial = new PowerExpontial();
        System.out.println(powerExpontial.check(a,b));
    }
}
