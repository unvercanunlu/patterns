package tr.unvercanunlu.patterns.observer;

import tr.unvercanunlu.patterns.observer.impl.Event;

public interface Observer {

    void update(Event event);

    String getIdentifier();
}
