package DesignPattern.Duck_Example.FactoryDesign_Pattern;

public class CheesePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Preparing CheesePizza!");
    }

    @Override
    public void bake() {
        System.out.println("Bake it normal!");
    }

    @Override
    public void cut() {
        System.out.println("Don't cut CheesePizza");
    }

    @Override
    public void box() {
        System.out.println("box it!");
    }
}
