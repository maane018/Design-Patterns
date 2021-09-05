package ObserverPattern.Approach1.Observers;

import ObserverPattern.Approach1.Observables.Observable;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observer {
//    List of all the observables
    List<Observable> observables;
    List<Integer> values;

    public WeatherStation(List<Observable> observables) {
        this.observables = observables;
        this.values = new ArrayList<>();
        for (Observable observable : this.observables) {
            observable.registerObserver(this);
            this.values.add(observable.getValue());
        }
    }

    @Override
    public void update(Observable observable) {
        int index = this.observables.indexOf(observable);
        if (index != -1) {
            values.set(index, observable.getValue());
            display();
        }
    }

    public void display() {
        for (Integer value : values)
            System.out.println(value);
    }
}
