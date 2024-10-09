package gerenciamento;

public class Veiculo {
	protected String modelo;
	protected int ano;
	protected double valorBase;
	
	public Veiculo (String modelo, int ano, double valorBase) {
		this.modelo = modelo;
		this.ano = ano;
		this.valorBase = valorBase;
	}
	
	public double calcularValorDiaria() {
		return 0;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
