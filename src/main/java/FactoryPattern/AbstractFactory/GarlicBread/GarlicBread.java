package FactoryPattern.AbstractFactory.GarlicBread;

public class GarlicBread {
    String type;

    GarlicBread(String type) {
        this.type = type;
    }

    void makeGarlicBread() {
        System.out.println("Made garlic bread of type" + type);
    }

    public void bake() {
        System.out.println("Baking the bread " + type);
    }

    public void cook() {
        System.out.println("Cooking the bread " + type);
    }

    public void serve() {
        System.out.println("serving the bread " + type);
    }
}
