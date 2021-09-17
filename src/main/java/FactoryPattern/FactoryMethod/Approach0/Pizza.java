package FactoryPattern.FactoryMethod.Approach0;

public class Pizza {
    public String type;

    public Pizza(String type, int size) {
        System.out.println("Created a pizza of " + type);
        this.type = type;
    }

    public void bake() {
        System.out.println("Baking the pizza " + type);
    }

    public void cook() {
        System.out.println("Cooking the pizza " + type);
    }

    public void serve() {
        System.out.println("serving the pizza " + type);
    }
}
