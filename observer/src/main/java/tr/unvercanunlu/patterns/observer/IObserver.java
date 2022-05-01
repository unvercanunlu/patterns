package tr.unvercanunlu.patterns.observer;

import tr.unvercanunlu.patterns.observer.impl.Event;

public interface IObserver {

    void update(Event event);

    String getIdentifier();
}
