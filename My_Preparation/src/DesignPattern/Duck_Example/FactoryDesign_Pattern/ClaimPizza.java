package DesignPattern.Duck_Example.FactoryDesign_Pattern;

public class ClaimPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing ClaimPizza!");
    }

    @Override
    public void bake() {
        System.out.println("Bake ClaimPizza normal!");
    }

    @Override
    public void cut() {
        System.out.println("Don't cut more than 5 ClaimPizza");
    }

    @Override
    public void box() {
        System.out.println("box it ClaimPizza!");
    }
}
