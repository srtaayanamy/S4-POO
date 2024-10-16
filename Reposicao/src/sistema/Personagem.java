package sistema;

public class Personagem {
	private String nome;
	private int vida;
	private int ataque;
	private int defesa;

	public Personagem(String nome, int vida, int ataque, int defesa) {
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	
	public void atacar(Personagem oponente) {
		int dano = this.ataque - oponente.getDefesa();
		if (dano > 0) {
			oponente.setVida(oponente.getVida() - dano);
			System.out.println(this.nome + " causou " + dano + " de dano a " + oponente.getNome());
		}
		else {
			System.out.println(oponente.getNome() + " defendeu o ataque de " + this.nome);
		}
	}

	
}
