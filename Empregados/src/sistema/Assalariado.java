package sistema;

public class Assalariado extends Empregado {
	
	private double salarioMensal;
	
	public Assalariado(String nome, String cpf, double salarioMensal) {
		super(nome, cpf);
		this.salarioMensal = salarioMensal;
	}
	@Override
	public double calcularSalario() {
		return salarioMensal;
	}
	
	public void exibirInfo() {
		super.exibirInfo(calcularSalario());
	}

}
