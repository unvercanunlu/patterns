package tr.unvercanunlu.patterns.singleton.database.impl;

import tr.unvercanunlu.patterns.singleton.database.IDatabaseAction;

public class Database implements IDatabaseAction {

	private static Database database;
	public String connectionURL;
	public String username;
	public String password;

	private Database() {
		// constructor that not accessible from other class

		System.out.println("Database is initialized.");
	}

	public static Database getInstance() {
		if (database == null) {
			database = new Database();
		}

		System.out.println(database + " instance is ready to use.");

		return database;
	}

	@Override
	public void connect(String connectionURL, String username, String password) {
		this.connectionURL = connectionURL;
		this.username = username;
		this.password = password;

		System.out.println(this + " is connected.");
	}

	@Override
	public void disconnect() {
		this.connectionURL = null;
		this.username = null;
		this.password = null;

		System.out.println(this + " is disconnected.");
	}

	@Override
	public String toString() {
		return "Database{" +
				"connectionURL='" + connectionURL + "', " +
				"username='" + username + "' , " +
				"password='" + password + "'" +
				'}';
	}
}
