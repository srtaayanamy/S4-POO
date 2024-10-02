package sistema;

public class Main {
	
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Anna", "12345", 0);
        ContaBancaria conta2 = new ContaBancaria("Julia", "6789", 0);

	        conta.depositar(500);
	        conta.mostrarSaldo();

	        conta.sacar(200);
	        conta.mostrarSaldo();

	        conta.transferir(100, conta2);
	        conta.mostrarSaldo();
	        conta2.mostrarSaldo();
		
	}
}