package DecoratorPattern.Approach1;

public abstract class Beverage {
    boolean hasChocolate = false;
    boolean hasCoffee = false;
    boolean hasCream = false;

    Beverage(boolean hasChocolate, boolean hasCoffee, boolean hasCream) {
        this.hasChocolate = hasChocolate;
        this.hasCoffee = hasCoffee;
        this.hasCream = hasCream;
    }
    public String getDescription() {
        return "Coffee";
    }
    public int cost() {
        return 10;
    }


    public void setHasChocolate(boolean hasChocolate) {
        this.hasChocolate = hasChocolate;
    }

    public void setHasCoffee(boolean hasCoffee) {
        this.hasCoffee = hasCoffee;
    }

    public void setHasCream(boolean hasCream) {
        this.hasCream = hasCream;
    }
}
