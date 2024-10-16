package sistema;

public class Guerreiro extends Personagem {

	public Guerreiro(String nome, int vida, int ataque, int defesa) {
		super(nome, vida, ataque, defesa);
		// TODO Auto-generated constructor stub
	}
	public void executarAcao(Personagem personagem) {
		if (personagem instanceof Arqueiro) {
			System.out.println("Errou o golpe");
		}
		else {
			System.out.println("Bateu forte");
		}
	}
}
