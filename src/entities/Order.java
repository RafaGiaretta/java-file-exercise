package entities;

public class Order extends Product{
	
	private Double totalValue;

	public Order(String name, Double price, Integer quantity, Double totalValue) {
		super(name, price, quantity);
		this.totalValue = totalValue;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void totalValue() {
		this.totalValue = getPrice() * getQuantity();	
	}
	
	@Override
	public String toString() {
		return "Order: \n" + "Product: " + getName() + "Total: $" + String.format("%.2", totalValue);
	}
	
}
