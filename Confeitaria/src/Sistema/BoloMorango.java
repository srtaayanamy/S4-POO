package Sistema;

public class BoloMorango extends Bolo {

	public BoloMorango(String nome, String tipoMassa, String tamanho, double preco) {
		super(nome, tipoMassa, tamanho, preco);
	}
	@Override
	public double calcularPreco() {
		return super.calcularPreco() + 15;
	}
}
