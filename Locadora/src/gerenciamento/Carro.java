package gerenciamento;

public class Carro extends Veiculo {

	public Carro(String modelo, int ano, double valorBase) {
		super(modelo, ano, valorBase);
	}
	@Override
	public double calcularValorDiaria() {
		return valorBase + 20 * (2024 - ano);
	}
}
