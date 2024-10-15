package sistema;

public class Luta {
	protected Lutador lutad1;
	protected Lutador lutad2;
	protected int turnos = 0;

	public Luta(Lutador lutad1, Lutador lutad2) {
		this.lutad1 = lutad1;
		this.lutad2 = lutad2;
	}

	public void iniciarLuta() {
		if (!lutad1.calcularCategoria().equals(lutad2.calcularCategoria())) {
			System.out.println("A luta é inválida");
			return;
		}
		
		while (lutad1.resistencia > 0 && lutad2.resistencia > 0) {
			turnos = turnos + 1;
			lutad1.atacar(lutad2);
			if (lutad2.resistencia <= 0) {
				System.out.println(lutad2.nome + " MORREU! #rip");
				System.out.println("A luta demorou " +turnos+ " turnos");
				return;
			}
			
			lutad2.atacar(lutad1);
			if (lutad1.resistencia <= 0) {
				System.out.println(lutad1.nome + " MORREU! #rip");
				System.out.println("A luta demorou " +turnos+ " turnos");
				return;
			}	
		}	
	}
}
