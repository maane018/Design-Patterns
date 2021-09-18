package ObserverPattern.BruteForce;

public class WeatherStation {
    public int temperature;
    public int humidity;

    WeatherStation() {
    }

    private void display() {
        System.out.println(this.temperature);
        System.out.println(this.humidity);
    }

    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

}
