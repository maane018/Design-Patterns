package FactoryPattern.SimpleFactory.Approach1;

public class PizzaShop1 {
    Pizza pizza;

    void createPizza(String type) {
//        Problem 1: This PizzaFactory is hard coded. Oops.
        pizza = new PizzaFactory().getPizza(type);
        pizza.cook();
        pizza.bake();
        pizza.serve();

    }
}
