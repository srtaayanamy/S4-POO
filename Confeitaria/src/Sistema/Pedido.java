package Sistema;

public class Pedido {
	private Bolo[] bolos;
	private int quantidadeBolos;
	
	public Pedido(int tamanho) {
		bolos = new Bolo[tamanho];
		quantidadeBolos = 0;
	}
	
	public void adicionarBolo(Bolo bolo) {
		if (quantidadeBolos < bolos.length) {
			bolos[quantidadeBolos] = bolo;
			quantidadeBolos = quantidadeBolos + 1;
		}
		else {
			System.out.println("Não cabem mais bolos no pedido");
		}
	}
	
	public double calcularTotal() {
		double total = 0;
		for (int contador = 0; contador < quantidadeBolos; contador = contador + 1) {
			total = total + bolos[contador].calcularPreco();
		}
		return total;
	}
	
	public void realizarPedido() {
		for (int contador = 0; contador < quantidadeBolos; contador = contador + 1) {
			bolos[contador].exibirDados();
			System.out.println("Preço novo: " + bolos[contador].calcularPreco());
		}
		System.out.println("Total do pedido: " + calcularTotal());
	}
	
}
