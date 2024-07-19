public class SingletonClassExample {
    private static SingletonClassExample singletonClassExample;

    //Creating private constructor to prevent instantiation from outside
    SingletonClassExample() {
    }

    public SingletonClassExample getInstance() {
        synchronized (SingletonClassExample.class) {
            if (singletonClassExample == null) {
                singletonClassExample = new SingletonClassExample();
            }
        }
        return singletonClassExample;
    }

}
