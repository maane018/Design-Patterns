package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.GarlicBread.GarlicBread;
import FactoryPattern.AbstractFactory.GarlicBread.GarlicBreadFactory1;
import FactoryPattern.AbstractFactory.Pizza.Pizza;
import FactoryPattern.AbstractFactory.Pizza.PizzaFactory1;

public class PizzaShop {
    PizzaFactory1 pizzaFactory;
    GarlicBreadFactory1 garlicBreadFactory;
    String type;

    PizzaShop(String type) {
        this.type = type;
        pizzaFactory = new PizzaFactory1();
        garlicBreadFactory = new GarlicBreadFactory1();
    }

    void getCombo() {
        Pizza pizza = pizzaFactory.getPizza(this.type);
        GarlicBread bread = garlicBreadFactory.makeGarlicBread(this.type);
        pizza.bake();
        pizza.cook();
        pizza.serve();
        bread.bake();
        bread.cook();
        bread.serve();
    }
}
