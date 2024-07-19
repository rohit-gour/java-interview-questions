package DesignPattern.Duck_Example;

public class FlyNoWay implements FlyBehaviour{
    public void fly(){
        System.out.println("Can't fly!");
    }
}
