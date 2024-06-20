package projeto_final_bloco_01;

import java.util.Scanner;

public class ArtigosDesportivos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;

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

			if (opcao == 5) {
				System.out.println("\nPrograma finalizado");
				leia.close();
				System.exit(0);
			}

			switch(opcao) {
			case 1:
				System.out.println("Criar/cadastrar produtos\n\n");

				break;
			case 2:
				System.out.println("Listar/buscar produtos\n\n");

				break;
			case 3:
				System.out.println("Atualizar produtos\n\n");

				break;
			case 4:
				System.out.println("Excluir/deletar produtos\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida, digite uma opção válida!\n");
				break;
			}
		}
	}

}


