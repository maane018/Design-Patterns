package ObserverPattern.Approach2.Observables;

import ObserverPattern.Approach2.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements Observable {
    private List<Observer> registeredObservers;
    private int temperature;

    public TemperatureSensor() {
        registeredObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer currentObserver : registeredObservers) {
            currentObserver.update(this.temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getValue() {
        return temperature;
    }
}
