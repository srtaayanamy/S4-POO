package main;
import excecoes.PesoInvalidoException;
import implementacoes.*;
import modelos.*;
import abstrato.Transporte;

public class Main {

	public static void main(String[] args) throws PesoInvalidoException {
		Endereco endereco = new Endereco("Rua da escadinha", "Mangabeira", "63300-000");
		Cliente cliente = new Cliente("Fafá", endereco);
		
		System.out.println("\nExpresso válido:\n");
		
		Transporte freteExpresso = new FreteExpresso(50);
		cliente.escolherTransporte(freteExpresso);
		cliente.calcularFrete();
		
		System.out.println("\nEconômico válido:\n");
		
		Transporte freteEconomico = new FreteEconomico(50);
		cliente.escolherTransporte(freteEconomico);
		cliente.calcularFrete();
		
		System.out.println("\nExpresso inválido:\n");
		
		Transporte freteExpressoNegativo = new FreteExpresso(-50);
		cliente.escolherTransporte(freteExpressoNegativo);
		cliente.calcularFrete();
		
		// esse código aqui está deplorável, i am sorry.
		// não fiz a parte do desconto, mas vou tentar após a entrega.
	}

}
