package modelos;

import abstrato.Product;
import interfaces.Discountable;

public class PhysicalProduct extends Product implements Discountable {


	public PhysicalProduct(String name, double price) {
		super(name, price);
	}

	@Override
	public void displayInfo() {
		System.out.println("Product: " + super.getName() + ", Price: " + super.getPrice());
		
	}

	@Override
	public double applyDiscount(double percentage) throws IllegalArgumentException {
		if (percentage < 1 || percentage >50) {
			throw new IllegalArgumentException("Percentual de desconto inválido");
		}
		return super.getPrice() * (1 - percentage / 100.0);
	}

}
