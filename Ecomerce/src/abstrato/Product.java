package abstrato;

public abstract class Product {
	protected String name;
	protected double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public abstract void displayInfo();
	
	public void applyDiscount(double percentage, boolean isCumulative) throws IllegalArgumentException {
		if (percentage < 1 || percentage > 50) {
			throw new IllegalArgumentException("Percentual de desconto inválido.");
		}
		
        System.out.println("Preço original: " + this.price);
        System.out.println("Preço com desconto: " + this.price * (1 - percentage / 100.0));
	}
	
	public abstract double applyDiscount(double percentage);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
