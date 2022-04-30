package tr.unvercanunlu.patterns.proxy.server.impl;

import tr.unvercanunlu.patterns.proxy.client.Client;
import tr.unvercanunlu.patterns.proxy.client.Role;
import tr.unvercanunlu.patterns.proxy.server.IServer;

public class ServerProxy implements IServer {

    private final ServerImpl adminServerConnection = new ServerImpl();

    @Override
    public void connect(Client client) {
        if (!validateClient(client) || !validateRole(client.role)) {
            return;
        }

        System.out.println("Validation is done.");

        adminServerConnection.connect(client);
    }

    boolean validateClient(Client client) {
        if (client == null) {
            System.out.println("Client information not found.");
            return false;
        }

        return true;
    }

    boolean validateRole(Role role) {
        if (role == null) {
            System.out.println("Role information not found.");
            return false;
        }

        if (!role.equals(Role.ADMIN)) {
            System.out.println("Not valid role.");
            return false;
        }

        return true;
    }
}
