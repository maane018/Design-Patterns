package FactoryPattern.SimpleFactory.Approach1;

public class PizzaShop2 {
    Pizza pizza;

    void createPizza(String type) {
        pizza = new PizzaFactory().getPizza(type);
        pizza.cook();
        pizza.bake();
        pizza.serve();

    }
}
