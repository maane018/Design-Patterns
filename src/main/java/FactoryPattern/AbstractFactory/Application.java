package FactoryPattern.AbstractFactory;

public class Application {
    public static void main(String[] args) {
        PizzaShop factory = new PizzaShop("Cheese");
        factory.getCombo();
    }

}
