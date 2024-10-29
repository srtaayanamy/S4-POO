package classes;

import interfaces.Pagamento;

public class PayPal implements Pagamento{

	public void realizarPagamento(double valor) {
		System.out.println("Pagamento de R$ "+valor+" no PayPal, realizado com sucesso!");
	}
	public void emitirRecibo() {
		System.out.println("Pagamento confirmado");
	}
	
}
