package FactoryPattern.AbstractFactory.GarlicBread;

public class GarlicBreadFactory1 {
    GarlicBread garlicBread;

    public GarlicBread makeGarlicBread(String type) {
        if (type.equals("Cheese"))
            this.garlicBread = new GarlicBread("cheesy");
        else if (type.equals("Spicy"))
            this.garlicBread = new GarlicBread("spicy");
        else
            this.garlicBread = new GarlicBread("plain");
        return this.garlicBread;
    }
}
