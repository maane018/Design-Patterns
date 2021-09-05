package ObserverPattern.Approach2;

import ObserverPattern.Approach2.Observers.Observer;
import ObserverPattern.Approach2.Observers.WeatherStation;
import ObserverPattern.Approach2.Observables.Observable;
import ObserverPattern.Approach2.Observables.TemperatureSensor;

public class Application {
    public static void main(String[] args) {
        Observable observable = new TemperatureSensor();
        Observer observer = new WeatherStation(observable);
        while (true)
            observer.display();
    }
}
