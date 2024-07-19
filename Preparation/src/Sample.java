public class Sample {
    int a;
    String name;
    void getResult(){
        int a = this.a;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s.a);
        System.out.println(s.name);
        s.getResult();
    }
}
