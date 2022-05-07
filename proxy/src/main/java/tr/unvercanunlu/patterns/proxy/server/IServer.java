package tr.unvercanunlu.patterns.proxy.server;

import tr.unvercanunlu.patterns.proxy.client.Client;

public interface IServer {

	void connect(Client client);
}
