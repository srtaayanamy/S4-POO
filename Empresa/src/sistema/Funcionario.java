package sistema;

public abstract class Funcionario { 
	protected String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract double calcularSalario();
	
	public void exibirNome() {
		System.out.println("Funcionário: "+nome);
	}
	
}
