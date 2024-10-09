package Sistema;

public class BoloChocolate extends Bolo {

	public BoloChocolate(String nome, String tipoMassa, String tamanho, double preco) {
		super(nome, tipoMassa, tamanho, preco);
	}
	@Override
	public double calcularPreco() {
		return super.calcularPreco() + 10;
	}
}
