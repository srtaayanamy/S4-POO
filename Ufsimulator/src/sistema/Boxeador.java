package sistema;

public class Boxeador extends Lutador{

	public Boxeador(String nome, double peso, int forca, int resistencia) {
		super(nome, peso, forca, resistencia);
	}
	
	@Override
	public void atacar(Lutador oponente) {
		int dano = (int) (forca * 0.25);
		oponente.resistencia = oponente.resistencia - dano;
		System.out.println(oponente.nome +"foi atacado e recebeu "+dano+" de dano.");
	}
}