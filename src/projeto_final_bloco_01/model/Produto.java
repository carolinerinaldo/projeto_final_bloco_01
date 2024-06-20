package projeto_final_bloco_01.model;

public abstract class Produto {
	private int estoque;
	private int quantidade;
	private String nome;
	private String setor;	
	

	public Produto(int estoque, int quantidade, String nome, String setor) {
		this.estoque = estoque;
		this.quantidade = quantidade;
		this.nome = nome;
		this.setor = setor;
	}
	
	public abstract void exibir();
	
	
	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}

	
	

}
