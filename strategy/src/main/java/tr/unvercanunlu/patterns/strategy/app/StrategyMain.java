package tr.unvercanunlu.patterns.strategy.app;

import tr.unvercanunlu.patterns.strategy.cart.Cart;
import tr.unvercanunlu.patterns.strategy.cart.CartItem;
import tr.unvercanunlu.patterns.strategy.impl.CreditCardPayment;
import tr.unvercanunlu.patterns.strategy.impl.PaypalPayment;
import tr.unvercanunlu.patterns.strategy.model.CreditCard;
import tr.unvercanunlu.patterns.strategy.model.PaypalAccount;
import tr.unvercanunlu.patterns.strategy.model.Product;

public class StrategyMain {

	static void payWithCreditCart() {
		Product tv = new Product();
		tv.name = "Samsung Television";
		tv.price = 500;
		System.out.println(tv + " is created.");

		Cart cart = new Cart();
		System.out.println(cart + " is created.");

		CartItem item = new CartItem();
		item.product = tv;
		item.amount = 1;
		System.out.println(item + " is created.");

		cart.add(item);
		System.out.println(item + " is added into " + cart);

		CreditCard creditCard = new CreditCard();
		creditCard.name = "Ünver Can Ünlü";
		creditCard.no = "12312453592424";
		creditCard.expireDate = "04/22";
		creditCard.cvv = "393";
		System.out.println(creditCard + " is created.");

		CreditCardPayment creditCardPayment = new CreditCardPayment(creditCard);

		cart.pay(creditCardPayment);
		System.out.println("cart after payment: " + cart);
	}

	static void payWithPaypal() {
		Product laptop = new Product();
		laptop.name = "Apple Laptop";
		laptop.price = 1000;
		System.out.println(laptop + " is created.");

		Cart cart = new Cart();
		System.out.println(cart + " is created.");

		CartItem item = new CartItem();
		item.product = laptop;
		item.amount = 2;
		System.out.println(item + " is created.");

		cart.add(item);
		System.out.println(item + " is added into " + cart);

		PaypalAccount paypalAccount = new PaypalAccount();
		paypalAccount.email = "unver";
		paypalAccount.password = "12345";
		System.out.println(paypalAccount + " is created.");

		PaypalPayment paypalPayment = new PaypalPayment(paypalAccount);

		cart.pay(paypalPayment);
		System.out.println("cart after payment: " + cart);
	}

	public static void main(String[] args) {

		payWithCreditCart();

		payWithPaypal();
	}
}
