package sistema;

public class Lutador {
	protected String nome;
	protected double peso;
	protected int forca;
	protected int resistencia;
	
	public Lutador (String nome, double peso, int forca, int resistencia) {
		this.nome = nome;
		this.peso = peso;
		this.forca = forca;
		this.resistencia = resistencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
	public void exibirDados() {
		System.out.println("Nome: "+nome+ ";Peso: "+peso+ ";Força: "+forca+ ";Resistencia: "+resistencia);
	}
	
	public String calcularCategoria() {
		if (peso <= 70) {
			return "Peso Leve";
		}
		else if (peso > 70 && peso < 85) {
			return "Peso Médio";
		}
		else {
			return "Peso Pesado";
		}
	}
	
	public void atacar(Lutador oponente) {
	}
	
}