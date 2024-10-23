package sistema;

public class Main {

	public static void main(String[] args) {
		FuncionarioTempoIntegral funcionario1 = new FuncionarioTempoIntegral("anna");
		FuncionarioHorista funcionario2 = new FuncionarioHorista("julia", 1200);
		
		System.out.println("Pagamento do mêsss!!!!\n");
		funcionario1.exibirNome();
		funcionario1.calcularSalario();
		funcionario2.exibirNome();
		funcionario2.calcularSalario();
		
	}

}
