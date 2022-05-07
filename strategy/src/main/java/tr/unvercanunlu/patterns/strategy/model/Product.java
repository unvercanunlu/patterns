package tr.unvercanunlu.patterns.strategy.model;

public class Product {
	public String name;
	public double price;

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + "', " +
				"price=" + price +
				'}';
	}
}
