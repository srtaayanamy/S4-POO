package sistema;

public class FuncionarioHorista extends Funcionario {
	private double horas;

	public FuncionarioHorista(String nome, double horas) {
		this.nome = nome;
		this.horas = horas;
	}
	
	public double calcularSalario() {
		double pagamentoHora = 1.2;
		double salario = this.horas * pagamentoHora;
		System.out.println("Salário: "+salario);
		return 0;
	}

}

