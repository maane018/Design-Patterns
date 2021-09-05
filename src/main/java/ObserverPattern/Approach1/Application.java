package ObserverPattern.Approach1;

import ObserverPattern.Approach1.Observables.HumiditySensor;
import ObserverPattern.Approach1.Observables.Observable;
import ObserverPattern.Approach1.Observables.TemperatureSensor;
import ObserverPattern.Approach1.Observers.Observer;
import ObserverPattern.Approach1.Observers.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Observable> observableList = new ArrayList<>();
        observableList.add(new TemperatureSensor());
        observableList.add(new HumiditySensor());
        Observer observer = new WeatherStation(observableList);
        while (true)
            observer.display();

    }
}
