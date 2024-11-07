package abstrato;

import excecoes.PesoInvalidoException;

public abstract class Transporte {
	public double peso;

	public Transporte(double peso) {
		this.peso = peso;
	}

	public abstract double calcularFrete() throws PesoInvalidoException;
	
}
