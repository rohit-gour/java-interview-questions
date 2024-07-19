package DesignPattern.Duck_Example.Singleton_Design;

public class Singleton {

    public static volatile Singleton getInstance;

    private Singleton() {
    }

    //We can use sunnchronized keyword in method level but it will reduce the time. So we can use synchronized block
    // instead of method level.
    public static Singleton getInstance() {
        if (getInstance == null) {
            synchronized (Singleton.class) {
                if (getInstance == null) {
                    getInstance = new Singleton();
                }
            }
        }
        return getInstance;
    }
}
