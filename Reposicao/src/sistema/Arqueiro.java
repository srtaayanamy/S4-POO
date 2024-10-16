package sistema;

public class Arqueiro extends Personagem{

	public Arqueiro(String nome, int vida, int ataque, int defesa) {
		super(nome, vida, ataque, defesa);
		// TODO Auto-generated constructor stub
	}
	public void executarAcao(Personagem personagem) {
		if (personagem instanceof Mago) {
			System.out.println("Errou a frechada");
		}
		else {
			System.out.println("Acertou a flecha");
		}

}

}
