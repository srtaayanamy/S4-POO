package sistema;

public class Luta {
	private Personagem pers1;
	private Personagem pers2;

	public Luta(Personagem pers1, Personagem pers2) {
		this.pers1 = pers1;
		this.pers2 = pers2;
	}
	
	public void lutar() {
		while (pers1.getVida() > 0 && pers2.getVida() > 0) {
			pers1.atacar(pers2);
			if (pers2.getVida() > 0) {
				pers2.atacar(pers1);
			}
		}
		
		if (pers1.getVida() > 0) {
			System.out.println(pers1.getNome() + " arregaçou o oponente");
		}
		else {
			System.out.println(pers2 + " arregaçou o oponente");
		}
		
	}

}
