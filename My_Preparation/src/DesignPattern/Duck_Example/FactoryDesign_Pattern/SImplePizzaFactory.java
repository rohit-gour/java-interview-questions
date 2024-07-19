package DesignPattern.Duck_Example.FactoryDesign_Pattern;

public class SImplePizzaFactory {
    public static Pizza getPizza(String type) {

        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("claim")) {
            pizza = new ClaimPizza();
        } else if (type.equals("perri")) {
            pizza = new PerripenPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
        public static void main(String[] args) {

        Pizza pizza = getPizza("veggie");
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

    }
}
