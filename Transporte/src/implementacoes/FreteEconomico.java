package implementacoes;
import abstrato.Transporte;
import excecoes.PesoInvalidoException;

public class FreteEconomico extends Transporte {
	
	public FreteEconomico(double peso) {
		super(peso);
	}

	private void validarPeso(double peso) throws IllegalArgumentException {
		if (peso <= 0) {
			throw new IllegalArgumentException("Peso inválido!");
		}
	}
	
	@Override
	public double calcularFrete() throws PesoInvalidoException {
		try {
			validarPeso( this.peso);
			return peso * 5;
		}
		catch (IllegalArgumentException e){
			System.out.println("ERRO:" + e.getMessage());
			return 0;
		}
		finally {
			System.out.println("O processo foi feito!");
		}
	}

}

