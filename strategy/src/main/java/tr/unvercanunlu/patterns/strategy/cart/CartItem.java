package tr.unvercanunlu.patterns.strategy.cart;

import tr.unvercanunlu.patterns.strategy.model.Product;

public class CartItem {

	public Product product;
	public int amount;

	public double calculateItemPrice() {
		return product.price * amount;
	}

	@Override
	public String toString() {
		return "CartItem{" +
				"product=" + product + ", " +
				"amount=" + amount +
				'}';
	}
}
