package FactoryPattern.FactoryMethod.Approach0;

public class PizzaFactory2 implements PizzaFactory{
    Pizza pizza;
    public Pizza getPizza(String type){
        if ("Cheese".equals(type)) {
            pizza = new Pizza("spicy cheesy", 10);
        } else if ("spicy".equals(type)) {
            pizza = new Pizza("less spicy", 2);
        } else if ("veggie".equals(type)) {
            pizza = new Pizza("only cheese", 50);
        }
        return pizza;
    }
}
