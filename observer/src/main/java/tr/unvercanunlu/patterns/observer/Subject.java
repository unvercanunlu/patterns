package tr.unvercanunlu.patterns.observer;

import tr.unvercanunlu.patterns.observer.impl.Event;

public interface Subject {

    void register(Observer observer);

    void unRegister(Observer observer);

    void notifies();

    void postEvent(Event event);
}
