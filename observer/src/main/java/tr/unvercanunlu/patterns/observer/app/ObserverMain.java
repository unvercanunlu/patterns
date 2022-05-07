package tr.unvercanunlu.patterns.observer.app;

import tr.unvercanunlu.patterns.observer.impl.Event;
import tr.unvercanunlu.patterns.observer.impl.EventListener;
import tr.unvercanunlu.patterns.observer.impl.EventManager;
import tr.unvercanunlu.patterns.observer.impl.EventType;

public class ObserverMain {

	public static void main(String[] args) {
		Event authError = new Event();
		authError.type = EventType.ERROR;
		authError.data = "Authentication Error";

		Event authSuccess = new Event();
		authSuccess.type = EventType.SUCCESS;
		authSuccess.data = "Authentication Success";

		EventManager eventManager = new EventManager();

		EventListener mobile = new EventListener("mobile");
		System.out.println(mobile + " is created.");
		eventManager.register(mobile);

		EventListener tv = new EventListener("tv");
		System.out.println(tv + " is created.");
		eventManager.register(tv);

		EventListener web = new EventListener("web");
		System.out.println(web + " is created.");
		eventManager.register(web);

		eventManager.postEvent(authError);

		eventManager.unRegister(tv);

		eventManager.postEvent(authSuccess);
	}
}
