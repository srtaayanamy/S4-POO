package gerenciamento;

public class Caminhao extends Veiculo {

	public Caminhao(String modelo, int ano, double valorBase) {
		super(modelo, ano, valorBase);
	}
	@Override
	public double calcularValorDiaria() {
		return valorBase * 1.5;
	}
}
