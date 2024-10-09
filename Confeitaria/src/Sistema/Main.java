package Sistema;

public class Main {

	public static void main(String[] args) {
		Bolo boloChocolate = new BoloChocolate("Chocolatudo", "Fina", "Pequeno", 50);
		Bolo boloMorango = new BoloMorango("Morangudo", "Fina", "Médio", 50);
		Bolo boloBaunilha = new BoloBaunilha("Baunilhado", "Fina", "Grande", 50);
		
		Pedido pedido = new Pedido(3);
		
		pedido.adicionarBolo(boloChocolate);
        pedido.adicionarBolo(boloMorango);
        pedido.adicionarBolo(boloBaunilha);
        
        pedido.realizarPedido();
	}

}
