package DecoratorPattern.Approach2;

public class Application {
    public static void main(String[] args) {
        Beverage beverage = new Decaf();
        beverage = new Chocolate(beverage);
        beverage = new Chocolate(beverage);
        System.out.println(beverage.getCost());
        System.out.println(beverage.getDescription());
    }
}
