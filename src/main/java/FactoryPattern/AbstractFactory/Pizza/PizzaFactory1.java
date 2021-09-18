package FactoryPattern.AbstractFactory.Pizza;


public class PizzaFactory1 implements PizzaFactory {
    Pizza pizza;

    public Pizza getPizza(String type) {
        if ("Cheese".equals(type)) {
            pizza = new Pizza("cheesy", 5);
        } else if ("spicy".equals(type)) {
            pizza = new Pizza("too spicy", 6);
        } else if ("veggie".equals(type)) {
            pizza = new Pizza("full of vegetables", 7);
        }
        return pizza;
    }
}
