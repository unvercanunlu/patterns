package tr.unvercanunlu.patterns.proxy.server.impl;

import tr.unvercanunlu.patterns.proxy.client.Client;
import tr.unvercanunlu.patterns.proxy.client.Role;
import tr.unvercanunlu.patterns.proxy.server.IServer;

public class ServerProxy implements IServer {

    private final ServerImpl adminServerConnection = new ServerImpl();

    @Override
    public void connect(Client client) {
        if (!validateClient(client)) {
            return;
        }

        System.out.println("Validation is done.");
        adminServerConnection.connect(client);
    }

    private boolean validateClient(Client client) {
        if (client == null) {
            System.out.println("Client information not found.");
            return false;
        }

        if (client.role == null) {
            System.out.println("Role information not found.");
            return false;
        }

        if (!client.role.equals(Role.ADMIN)) {
            System.out.println("Not valid role.");
            return false;
        }

        return true;
    }
}
