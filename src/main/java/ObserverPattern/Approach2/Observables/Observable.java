package ObserverPattern.Approach2.Observables;

import ObserverPattern.Approach2.Observers.Observer;

public interface Observable {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

    int getValue();
}
