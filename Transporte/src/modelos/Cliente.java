package modelos;

import abstrato.Transporte;
import excecoes.PesoInvalidoException;

public class Cliente {
	public String nome;
	public Endereco endereco;
	public Transporte transporte;
	
	public Cliente (String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public void escolherTransporte(Transporte transporte) {
		this.transporte = transporte;
	}
	
	public void calcularFrete() {
		try {
			double valorFrete = transporte.calcularFrete();
			System.out.println("Cliente: "+nome+ "\nEndereço: "+endereco+ "\nFrete: R$"+valorFrete);
		}
		catch (PesoInvalidoException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("O processo foi feito.");
		}
	}
}
	

