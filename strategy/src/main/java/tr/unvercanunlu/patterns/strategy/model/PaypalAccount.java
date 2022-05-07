package tr.unvercanunlu.patterns.strategy.model;

public class PaypalAccount {

	public String email;
	public String password;

	@Override
	public String toString() {
		return "PaypalAccount{" +
				"email='" + email + "', " +
				"password='" + password + "'" +
				'}';
	}
}
