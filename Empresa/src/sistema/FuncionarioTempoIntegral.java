package sistema;

public class FuncionarioTempoIntegral extends Funcionario {

	public FuncionarioTempoIntegral(String nome) {
		this.nome = nome;
		// TODO Auto-generated constructor stub
	}

	public double calcularSalario() {
		double salario = 1500;
		System.out.println("Salário: "+salario);
		return 0;
	}
}
