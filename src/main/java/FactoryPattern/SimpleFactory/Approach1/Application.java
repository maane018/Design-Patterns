package FactoryPattern.SimpleFactory.Approach1;

public class Application {
    public static void main(String[] args) {
        PizzaShop1 pizzaShop = new PizzaShop1();
        pizzaShop.createPizza("Cheese");
    }
}
