package tr.unvercanunlu.patterns.singleton.main;

import tr.unvercanunlu.patterns.singleton.database.impl.Database;

public class SingletonMain {

	public static void main(String[] args) {
		Database database = Database.getInstance();

		database.connect("127.0.0.1:80", "user", "12345");

		Database anotherDatabase = Database.getInstance();

		anotherDatabase.disconnect();
	}
}
