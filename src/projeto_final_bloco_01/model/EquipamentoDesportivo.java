package projeto_final_bloco_01.model;

public class EquipamentoDesportivo extends Produto{
	private String categoria;
	
	public EquipamentoDesportivo(int estoque, int quantidade, String nome, String setor, String categoria) {
        super(estoque, quantidade, nome, setor);
        this.categoria = categoria;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + getNome() + ", Setor: " + getSetor() + ", Categoria: " + categoria + ", Quantidade: " + getQuantidade());
    }

}
