public class Animal1 extends Animal {

    @Override
    public void animmalSound() throws Exception {
        String name = "Rohit";
        if(name == "Rohit")
            throw new Exception("Some Exception is there in the code");
        System.out.println("Dog Sound! ");
    }
}
