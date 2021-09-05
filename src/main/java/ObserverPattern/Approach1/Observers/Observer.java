package ObserverPattern.Approach1.Observers;

import ObserverPattern.Approach1.Observables.Observable;

public interface Observer {
    void update(Observable observable);

    void display();
}
