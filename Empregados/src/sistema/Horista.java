package sistema;

public class Horista extends Empregado {

	private double salarioHora;
	private double horas;
	
	public Horista(String nome, String cpf, double horas, double salarioHora) {
		super(nome, cpf);
		this.horas = horas;
		this.salarioHora = salarioHora;
	}
	
	@Override
	public double calcularSalario() {
		return salarioHora * horas;
	}

	public void exibirInfo() {
		super.exibirInfo(calcularSalario());
	}
}
