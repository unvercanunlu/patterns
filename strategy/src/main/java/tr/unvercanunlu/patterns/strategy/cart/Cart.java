package tr.unvercanunlu.patterns.strategy.cart;

import tr.unvercanunlu.patterns.strategy.IPaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	public final List<CartItem> items = new ArrayList<>();

	public void add(CartItem item) {
		items.add(item);
	}

	public double calculateTotal() {
		double total = 0;

		for (CartItem item : items) {
			double itemPrice = item.calculateItemPrice();
			total += itemPrice;
		}

		return total;
	}

	public void pay(IPaymentStrategy payment) {
		double total = calculateTotal();

		payment.pay(total);

		for (int i = 0; i < items.size(); i++) {
			CartItem item = items.get(i);
			if (item != null) {
				items.remove(item);
			}
		}
	}

	@Override
	public String toString() {
		return "Cart{items=" + items + '}';
	}
}
