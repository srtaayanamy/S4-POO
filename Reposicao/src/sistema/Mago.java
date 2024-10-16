package sistema;

public class Mago extends Personagem{

	public Mago(String nome, int vida, int ataque, int defesa) {
		super(nome, vida, ataque, defesa);
	}
	
	public void executarAcao(Personagem personagem) {
		if (personagem instanceof Guerreiro) {
			System.out.println("Lançou um feitiço e errou");
		}
		else {
			System.out.println("Lançou feitiço");
		}
	}
}
