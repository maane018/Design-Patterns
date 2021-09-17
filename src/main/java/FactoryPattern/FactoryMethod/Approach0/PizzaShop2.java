package FactoryPattern.FactoryMethod.Approach0;

public class PizzaShop2 {
    Pizza pizza;
    PizzaFactory pizzaFactory;
    PizzaShop2(PizzaFactory factory) {
        pizzaFactory = factory;
    }
    void createPizza(String type) {
        pizza = pizzaFactory.getPizza(type);
        pizza.cook();
        pizza.bake();
        pizza.serve();

    }
}
