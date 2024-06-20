package projeto_final_bloco_01;

import java.util.Scanner;
import projeto_final_bloco_01.controller.Controller;
import projeto_final_bloco_01.model.EquipamentoDesportivo;
import projeto_final_bloco_01.model.Produto;

public class ArtigosDesportivos {
	
	private static Controller controller = new Controller();

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao, quantidade, estoque;
		String nome, setor, categoria;

		while (true) {


			System.out.println("*****************************************************");
			System.out.println("                PRODUTOS DESPORTIVOS                 ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar/cadastrar produtos             ");
			System.out.println("            2 - Listar/buscar produtos               ");
			System.out.println("            3 - Atualizar produtos                   ");
			System.out.println("            4 - Excluir/deletar produtos             ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			switch(opcao) {
			case 1:
				System.out.println("Criar/cadastrar produtos\n");
				leia.nextLine();
				System.out.println("Digite o nome do produto:");
		        nome = leia.nextLine();	
		        System.out.println("Digite o setor:");
		        setor = leia.nextLine();
		        System.out.println("Digite a categoria:");
		        categoria = leia.nextLine();
		        System.out.println("Digite a quantidade:");
		        quantidade = leia.nextInt();
		        leia.nextLine();
		        System.out.println("Digite o estoque:");
		        estoque = leia.nextInt();
		        leia.nextLine();
		        
		        Produto novoProduto = new EquipamentoDesportivo(estoque, quantidade, nome, setor, categoria);
		        controller.colocar(novoProduto);
		        System.out.println("Produto adicionado!");

				break;
			case 2:
				System.out.println("Listar/buscar produtos\n\n");
				for (Produto produto : controller.getProdutos()) {
		            produto.exibir();
		        }

				break;
			case 3:
				System.out.println("Atualizar produtos\n\n");
			    System.out.println("Digite o nome do produto para atualizar:");
			    leia.nextLine();
			    nome = leia.nextLine();
			    Produto produto = controller.buscarPorNome(nome);
			    if (produto != null) {
			        System.out.println("Digite o novo estoque:");
			        estoque = leia.nextInt();
			        leia.nextLine();
			        produto.setEstoque(estoque);
			        System.out.println("Produto atualizado!");
			    } else {
			        System.out.println("Produto não encontrado.");
			    }
			    break;
			case 4:
				System.out.println("Excluir/deletar produtos\n\n");
				System.out.println("Digite o nome do produto que deseja remover: ");
				leia.nextLine();
				nome = leia.nextLine();
				produto = controller.buscarPorNome(nome);
			    if (produto != null) {
			        controller.retirar(produto);
			        System.out.println("Produto removido com sucesso!");
			    } else {
			        System.out.println("Produto não encontrado.");
			    }
			    break;
			case 5:
				System.out.println("\nPrograma finalizado");
				leia.close();
				System.exit(0);

				break;
			default:
				System.out.println("\nOpção Inválida, digite uma opção válida!\n");
				break;
			}
		}
	}

}


