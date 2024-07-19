package DesignPattern.Duck_Example.FactoryDesign_Pattern;

public class VeggiePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing VeggiePizza!");
    }

    @Override
    public void bake() {
        System.out.println("Bake VeggiePizza normal!");
    }

    @Override
    public void cut() {
        System.out.println("Don't cut more than 5 VeggiePizza");
    }

    @Override
    public void box() {
        System.out.println("box it VeggiePizza!");
    }
}
