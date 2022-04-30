package tr.unvercanunlu.patterns.proxy.client;

public class Client {

    public String username;

    public String password;

    public Role role;

    @Override
    public String toString() {
        return "Client{"
                + "username='" + username + "', "
                + "password='" + password + "', "
                + "role=" + role
                + '}';
    }
}
