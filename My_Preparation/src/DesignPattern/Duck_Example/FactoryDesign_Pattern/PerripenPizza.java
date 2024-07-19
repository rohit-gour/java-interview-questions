package DesignPattern.Duck_Example.FactoryDesign_Pattern;

public class PerripenPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing PerripenPizza!");
    }

    @Override
    public void bake() {
        System.out.println("Bake it normal!");
    }

    @Override
    public void cut() {
        System.out.println("Don't cut PerripenPizza");
    }

    @Override
    public void box() {
        System.out.println("box it PerripenPizza!");
    }
}
