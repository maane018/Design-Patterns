package DecoratorPattern.Approach1;

public class Application {
    public static void main(String[] args) {
        Beverage beverage = new Decaf(false,false,true);
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
    }
}
