package FactoryPattern.FactoryMethod.Approach0;

public class Application {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory2();
        PizzaShop1 pizzaShop = new PizzaShop1(factory);
        pizzaShop.createPizza("Cheese");
    }
}
