package tr.unvercanunlu.patterns.proxy.server.impl;

import tr.unvercanunlu.patterns.proxy.client.Client;
import tr.unvercanunlu.patterns.proxy.server.IServer;

public class ServerImpl implements IServer {

    @Override
    public void connect(Client client) {
        System.out.println("Server is connected with " + client + ".");
    }
}
