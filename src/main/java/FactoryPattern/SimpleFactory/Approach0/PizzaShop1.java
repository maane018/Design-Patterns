package FactoryPattern.SimpleFactory.Approach0;

public class PizzaShop1 {
    Pizza pizza;

    void createPizza(String type) {
        if ("Cheese".equals(type)) {
            pizza = new Pizza("cheesy", 5);
        } else if ("spicy".equals(type)) {
            pizza = new Pizza("too spicy", 6);
        } else if ("veggie".equals(type)) {
            pizza = new Pizza("full of vegetables", 7);
        }

        pizza.cook();
        pizza.bake();
        pizza.serve();

    }
}
