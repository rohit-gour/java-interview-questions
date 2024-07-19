package Animal_Ex;

public class Wolf extends Canine{

    public Wolf(int s, int v){
        super(s);
    }
    public void makeNoise(){
        System.out.println("I'm wolf !!");
    }
    public void eat(){
        System.out.println("Hey wolf is non-veg !");
    }
    public void roam(){

        super.roam();
//        System.out.println("Hey i'm from Wolf class I can stay in room ! ");
    }
}
