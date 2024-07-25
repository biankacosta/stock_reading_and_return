package entities;

public class Product {
	private String name;
	private double unitary_price;
	private int quantity;
	
	public Product(String name, double unitary_price, int quantity){
		this.name = name;
		this.unitary_price = unitary_price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getUnitary_price() {
		return unitary_price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public double totalPrice() {
		return unitary_price * quantity;
	}
	
	

}
