package DecoratorPattern.Approach0;

public class Application {
    public static void main(String[] args) {
        Beverage beverage = new DecafWithChocolate();
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
    }
}
