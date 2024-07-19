package DesignPattern.Duck_Example;

public class MuteQuack implements QuackBehaviour{
    public void quack(){
        System.out.println("Can't quack!");
    }
}
