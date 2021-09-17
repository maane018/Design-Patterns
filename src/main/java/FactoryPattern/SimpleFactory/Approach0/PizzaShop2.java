package FactoryPattern.SimpleFactory.Approach0;

public class PizzaShop2 {
    Pizza pizza;
    void createPizza(String type) {
//        Problem 1+2 : What if we want to change size? Will have to change both classes.
        switch (type) {
            case "Cheese" -> pizza = new Pizza("cheesy", 5);
            case "spicy" -> pizza = new Pizza("too spicy", 6);
            case "veggie" -> pizza = new Pizza("full of vegetables", 7);
        }

        pizza.cook();
        pizza.bake();
        pizza.serve();

    }
}
