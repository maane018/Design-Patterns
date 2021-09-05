package ObserverPattern.Approach0;

public class Sensor {
    public int temperature;
    public int humidity;

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
//        This will be used by actual sensors
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
//        This will be used by actual sensors
        this.temperature = temperature;
    }
}
