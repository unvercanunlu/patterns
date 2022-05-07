package tr.unvercanunlu.patterns.strategy.impl;

import tr.unvercanunlu.patterns.strategy.IPaymentStrategy;
import tr.unvercanunlu.patterns.strategy.model.CreditCard;

public class CreditCardPayment implements IPaymentStrategy {

	private final CreditCard card;

	public CreditCardPayment(CreditCard card) {
		this.card = card;
	}

	@Override
	public void pay(double amount) {
		System.out.println(amount + " is paid with " + card);
	}
}
