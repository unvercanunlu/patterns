package tr.unvercanunlu.patterns.proxy.app;

import tr.unvercanunlu.patterns.proxy.client.Client;
import tr.unvercanunlu.patterns.proxy.client.Role;
import tr.unvercanunlu.patterns.proxy.server.IServer;
import tr.unvercanunlu.patterns.proxy.server.impl.ServerProxy;

public class Main {

    static void userTryToConnect() {
        Client user = new Client();
        user.username = "user";
        user.password = "12345";
        user.role = Role.USER;

        IServer server = new ServerProxy();
        server.connect(user);
    }

    static void tryToConnect() {
        IServer server = new ServerProxy();
        server.connect(null);
    }

    static void tryToConnectWithoutRole() {
        Client client = new Client();
        client.username = "client";
        client.password = "12345";

        IServer server = new ServerProxy();
        server.connect(client);
    }

    static void adminTryToConnect() {
        Client admin = new Client();
        admin.username = "admin";
        admin.password = "12345";
        admin.role = Role.ADMIN;

        IServer server = new ServerProxy();
        server.connect(admin);
    }

    public static void main(String[] args) {
        tryToConnect();

        tryToConnectWithoutRole();

        userTryToConnect();

        adminTryToConnect();
    }
}
