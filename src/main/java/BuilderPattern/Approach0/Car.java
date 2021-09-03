package BuilderPattern.Approach0;

public class Car {
    public String name;
    public int length;
    public int width;
    public int height;
    public String company;
    public int mileage;
    public int cost;
    public boolean isReleased;

    Car(String name, int length, int width, int height, String company, int mileage, int cost, boolean isReleased) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.company = company;
        this.mileage = mileage;
        this.cost = cost;
        this.isReleased = isReleased;
    }

    public void setReleased(boolean released) {
        isReleased = released;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
