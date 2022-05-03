package tr.unvercanunlu.patterns.singleton.database;

public interface IDatabaseAction {

	void connect(String connectionURL, String username, String password);

	void disconnect();
}
