package staticExamples;

public class StaticClassExample {
    private static int count = 0;
    public static class MyClass{
        public static void getIncrement(){
            count++;
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        StaticClassExample staticClassExample = new StaticClassExample();

        StaticClassExample.MyClass myClass = new StaticClassExample.MyClass();
                MyClass.getIncrement();
        System.out.println(count);
    }
}
