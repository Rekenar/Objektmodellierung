package main.java.logic.entities;

public class Production {
	public Production(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	private String name;
	private int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
