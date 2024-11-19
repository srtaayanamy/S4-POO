package main;
import modelos.PhysicalProduct;
import modelos.Order;

public class Main {

	public static void main(String[] args) {
		try {
			PhysicalProduct physicalProduct = new PhysicalProduct("carro", 2500);
			physicalProduct.displayInfo();
			
			int discount = 20;
			double priceDiscount = physicalProduct.applyDiscount(discount);
			System.out.println("Preço com desconto: " + priceDiscount);
			physicalProduct.displayInfo();
			
			double discount2 = 60;
			physicalProduct.applyDiscount(discount2);
		}
		catch (IllegalArgumentException e){
			System.err.println("Erro ao aplicar desconto: " + e.getMessage());
		}
		
		try {
			Order order = new Order();
            PhysicalProduct produto = new PhysicalProduct("carroça", 2500);
            
            order.addProduct(produto, 2);
            order.displayOrderSummary();

            order.addProduct(produto, -1);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao adicionar produto: " + e.getMessage());
        }
	}

}
