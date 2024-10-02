package sistema;

public class ContaBancaria {
	private String nome;
	private String numero;
	private double saldo;
	
	public ContaBancaria (String nome, String numero, double saldo) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = 0.0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo = this.saldo + valor;
		}
		else {
			System.out.println("O valor deve ser positivo.");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Foi sacado R$" + (int) valor + " da conta bancária.");}
		else if (valor > saldo) {
			System.out.println("Não há saldo suficiente.");}
		else {
			System.out.println("O valor do saque deve ser positivo");}
	}
	
	public void mostrarSaldo() {
		System.out.println("O saldo da conta é R$" + (int) saldo);
	}
	
	public void transferir(double valor, ContaBancaria destinatario) {
		if (valor > 0) {
			if (saldo >= valor) {
			sacar(valor);
			destinatario.depositar(valor);
			System.out.println("Transferência de R$" + valor + " feita para " + destinatario.getNome());
			}
			else {
				System.out.println("Não tem saldo suficiente");}
		}
		else {
			System.out.println("O valor deve ser positivo");}
	}
    
	}
	