package projeto_final_bloco_01.Repository;

import projeto_final_bloco_01.model.Produto;

public interface Repository {
	
	void colocar(Produto produto);
    void retirar(Produto produto);
    Produto buscarPorNome(String nome);
    void atualizarEstoque(Produto produto, int novoEstoque);
	
}
