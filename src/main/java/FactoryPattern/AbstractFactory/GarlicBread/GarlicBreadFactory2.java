package FactoryPattern.AbstractFactory.GarlicBread;

public class GarlicBreadFactory2 {
    GarlicBread garlicBread;

    void makeGarlicBread(String type) {
        if (type.equals("Cheese"))
            this.garlicBread = new GarlicBread("too cheesy");
        else if (type.equals("Spicy"))
            this.garlicBread = new GarlicBread("too spicy");
        else
            this.garlicBread = new GarlicBread("too plain");
    }
}
