package gerenciamento;

public class Main {

	public static void main(String[] args) {
		Veiculo[] veiculos = new Veiculo[3];
		veiculos[0] = new Carro("Ferrari", 2023, 200);
        veiculos[1] = new Motos("Honda", 2023, 49);
        veiculos[2] = new Caminhao("Mercedes", 2023, 500);
        for (Veiculo automovel : veiculos) {
        	System.out.println("Modelo; " + automovel.getModelo());
        	System.out.println("Ano: " + automovel.getAno());
        	System.out.println("Valor da diária: " + automovel.calcularValorDiaria());
        }
	}
}
