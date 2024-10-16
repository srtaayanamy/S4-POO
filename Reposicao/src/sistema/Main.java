package sistema;

public class Main {

	public static void main(String[] args) {
		Personagem mago = new Mago("harry potter", 100, 70, 30);
		Personagem guerreiro = new Guerreiro("naruto", 100, 70, 30);
		Luta luta = new Luta(mago, guerreiro);
		luta.lutar();

	}

}
