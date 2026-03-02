package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.GerenciadorTarefas;
import entities.Tarefa;
import enums.prioridade.Prioridade;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		GerenciadorTarefas gerenciador = new GerenciadorTarefas();

		int opcao = -1;

		while (opcao != 0) {

			System.out.println("\n===== MENU =====");
			System.out.println("1 - Adicionar tarefa");
			System.out.println("2 - Listar todas as tarefas");
			System.out.println("3 - Conluir tarefa");
			System.out.println("4 - Remover tarefa");
			System.out.println("5 - Procurar tarefa pelo id");
			System.out.println("6 - Listar tarefas por prioridade");
			System.out.println("0 - Sair");

			try {

				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {
				case 1:
					System.out.println("Descreva a tarefa: ");
					String descricao = sc.nextLine();
					
					System.out.println("Escolhe a prioridade:");
					System.out.println("1 - BAIXA");
					System.out.println("2 - MEDIA ");
					System.out.println("3 - ALTA");
					
						int prioridadeOpcao = sc.nextInt();
						sc.nextLine();
						
						Prioridade prioridade = null;
					
						switch(prioridadeOpcao) {
						case 1: 
							prioridade = Prioridade.BAIXA;
							break;
							
						case 2:
							prioridade = Prioridade.MEDIA;
							break;
							
						case 3:
							prioridade = Prioridade.ALTA;
							break;
						default:
							prioridade = Prioridade.MEDIA;
							
						}
						
						
						gerenciador.adicionarTarefa(descricao, prioridade);
					
					System.out.println();
					System.out.println("Tarefa adicionada!");
					break;

				case 2:
					gerenciador.listarTarefas();
					break;

				case 3:
				    System.out.print("Digite o id da tarefa concluída: ");
				    int idConcluida = sc.nextInt();

				    boolean concluida = gerenciador.marcarComoConcluida(idConcluida);

				    if(concluida) {
				        System.out.println("Tarefa concluída!");
				    } else {
				        System.out.println("Tarefa não encontrada!");
				    }
				    break;
				case 4:
					System.out.print("Digite o id da tarefa que deseja remover: ");
					int idRemovida = sc.nextInt();
					boolean removida = gerenciador.removerTarefa(idRemovida);
					if(removida) {
						System.out.println("Tarefa removida!");
					}
					else {
						System.out.println("Tarefa não encontrada!");
					}
					break;
					
				case 5:
				    System.out.print("Digite o id da tarefa que deseja buscar: ");
				    int idBuscar = sc.nextInt();

				    Tarefa tarefa = gerenciador.buscarPorId(idBuscar);

				    if (tarefa != null) {
				        System.out.println(tarefa);
				    } else {
				        System.out.println("Tarefa não encontrada.");
				    }
				    break;
				    
				case 6:
					gerenciador.listarPrioridade();
					break;
				case 0:
					System.out.println("Programa finalizado!");
					break;

				default:
					System.out.println("Opção inválida!");
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Digite um número.");
				sc.nextLine();

			}
		}
		sc.close();
	}
}
