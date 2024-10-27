package sistema;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Empregado> empregados = new ArrayList<>();
		
		empregados.add(new Assalariado("Anna", "123456-78", 3000));
		empregados.add(new Horista("Julia", "987654-32", 10, 200));
		
		for (Empregado cont : empregados) {
			if (cont instanceof Assalariado) {
				System.out.println("Hora de receber dinheirinhos, CLT ASSALARIADO!!!");
				cont.exibirInfo();
			}
			
			else if (cont instanceof Horista) {
				System.out.println("Hora de receber dinheirinhos, CLT HORISTA!!!");
				cont.exibirInfo();
			}
		}
	}
}
