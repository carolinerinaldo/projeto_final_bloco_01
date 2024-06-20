package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import java.util.List;
import projeto_final_bloco_01.Repository.Repository;
import projeto_final_bloco_01.model.Produto;

public class Controller implements Repository {
	private List<Produto> produtos = new ArrayList<>();


	@Override
	public void colocar(Produto produto) {
		produtos.add(produto);
		System.out.println("Produto colocado!");
	}

	@Override
	public void retirar(Produto produto) {
		produtos.remove(produtos);
		System.out.println("Produto retirado");
		
	}

	@Override
	public Produto buscarPorNome(String nome) {
		for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
		}
		System.out.println("Produto não encontrado");
		return null;
	}
		

	@Override
	public void atualizarEstoque(Produto produto, int novoEstoque) {
		if (produtos.contains(produto)) {
            produto.setEstoque(novoEstoque);
            System.out.println("Produto atualizado");
        } else {
            System.out.println("Produto não encontrado.");
        }
	}

}
