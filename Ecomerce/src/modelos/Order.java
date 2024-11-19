package modelos;

import java.util.ArrayList;
import java.util.List;
import abstrato.Product;

public class Order {
	private List<Product> products;
	private double totalAmount;

	public Order() {
		this.products = new ArrayList<>();
		this.totalAmount = 0;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void addProduct(Product product) {
		try {
			this.products.add(product);
			this.totalAmount = product.getPrice() + totalAmount;
		} catch (IllegalArgumentException e ) {
			System.out.println(e.getMessage());
		}
	}
	
	public void addProduct(Product product, int quantity) throws IllegalArgumentException{
		if (quantity <= 0) {
			throw new IllegalArgumentException("Quantidade inválida.");
		}
		for (int i = 0; i < quantity; i++) {
			this.addProduct(product);
		}
	}
	
	public void displayOrderSummary() {
		this.products.forEach((Product::displayInfo));
		System.out.println("Total do pedido: "+ this.totalAmount);
	}
	
}
