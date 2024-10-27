package sistema;

public abstract class Empregado {
	protected String nome;
	protected String cpf;

	public Empregado(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public abstract double calcularSalario();
	
	public void exibirInfo() {
		System.out.println("Nome: "+nome);
		System.out.println("CPF: "+cpf);
	}
	
	public void exibirInfo(double salario) {
		System.out.println("Nome: "+nome);
		System.out.println("CPF: "+cpf);
		System.out.println("Salário: "+salario);
	}
	
}
