package gerenciamento;

public class Motos extends Veiculo {

	public Motos(String modelo, int ano, double valorBase) {
		super(modelo, ano, valorBase);
	}
	@Override
	public double calcularValorDiaria() {
		double diaria = valorBase - 10 * (2024 - ano);
		if (diaria < 50) {
			return 50;
		}
		else {
			return diaria;
		}
	}
}