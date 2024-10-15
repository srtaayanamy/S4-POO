package sistema;

public class Main {
	
	public static void main(String[] args) {
		Lutador karateca = new Karateca("KOKIMOTO", 80, 70, 100);
		Lutador boxeador = new Boxeador("WHINDERSSON", 80, 70, 100);
		
		Luta luta = new Luta(karateca, boxeador);
		karateca.exibirDados();
		boxeador.exibirDados();
		luta.iniciarLuta();
	}

}
