package tr.unvercanunlu.patterns.strategy.impl;

import tr.unvercanunlu.patterns.strategy.IPaymentStrategy;
import tr.unvercanunlu.patterns.strategy.model.PaypalAccount;

public class PaypalPayment implements IPaymentStrategy {

	private final PaypalAccount account;

	public PaypalPayment(PaypalAccount account) {
		this.account = account;
	}

	@Override
	public void pay(double amount) {
		System.out.println(amount + " is paid with " + account);
	}
}
