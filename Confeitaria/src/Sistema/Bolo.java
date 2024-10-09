package Sistema;

public class Bolo {
	protected String nome;
	protected String tipoMassa;
	protected String tamanho;
	protected double preco;
	
	public Bolo (String nome, String tipoMassa, String tamanho, double preco) {
		this.nome = nome;
		this.tipoMassa = tipoMassa;
		this.tamanho = tamanho;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoMassa() {
		return tipoMassa;
	}

	public void setTipo_massa(String tipoMassa) {
		this.tipoMassa = tipoMassa;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void exibirDados() {
		System.out.println("Dados do bolo: Nome:" + nome + "; Tipo de massa:" + tipoMassa + "; Tamanho:" + tamanho + "; Preço:" + preco);
	}
	
	public double calcularPreco() {
        if (tamanho == "Pequeno") {
            return preco;
        } else if (tamanho == "Médio") {
            return preco + (preco * 0.2);
        } else if (tamanho == "Grande") {
            return preco + (preco * 0.5);
        } else {
        	System.out.println("Tamanho inválido.");
        }
		return preco;
    }
}
