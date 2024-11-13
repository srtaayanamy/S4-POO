package sistema;

import java.util.ArrayList;

import excecoes.EntradaInvalidaException;
import excecoes.NaoNegativosException;
import excecoes.ProdutoNaoEncontradoException;
import excecoes.QuantidadeInsuficienteException;

public class Estoque {
	
	private ArrayList <Produto> produtos;

	public Estoque() {
		produtos = new ArrayList<>();
	}
	
	public void adicionarProduto(String nome, int quantidade, double preco) throws EntradaInvalidaException, NaoNegativosException{
		if (quantidade < 0 || preco < 0) {
			throw new NaoNegativosException("Dados inválidos! Insira quantidades e preços acima de zero.\n");
		}
		else {
			produtos.add(new Produto(nome, quantidade, preco));
			System.out.println("Produto adicionado!\n");	
		}
	}
	
	public void consultarEstoque() {
		if (produtos.isEmpty()) {
			System.out.println("O estoque está vazio.\n");
		}
		else {
			for (Produto indice: produtos) {
				System.out.println("Nome: "+ indice.getNome());
				System.out.println("Quantidade: "+ indice.getQuantidade());
				System.out.println("Preço: "+ indice.getPreco());
			}
		}
	}
	
	public void venderProduto(String nome, int quantidade) throws ProdutoNaoEncontradoException, QuantidadeInsuficienteException{
		for (Produto indice: produtos) {
			if (indice.getNome() == nome) {
				if (indice.getQuantidade() >= quantidade) {
					int nQuantidade = indice.getQuantidade() - quantidade;
					indice.setQuantidade(nQuantidade);
					System.out.println("Produto vendido.\n");
					return;
				}
				else {
					throw new QuantidadeInsuficienteException("Quantidade inválida.\n");
				}
			}
			else {
				throw new ProdutoNaoEncontradoException("O produto não foi encontrado.\n");
			}
		}
	}
}
