package app;

import service.GerenciadorTarefas;
import java.util.Scanner;

public class TarefasApp {
    public static void main (String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner scanner =new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n---- Gerenciador de Tarefas ----");
            System.out.println("1. - Adicionar Tarefa");
            System.out.println("2. - Remover Tarefa");
            System.out.println("3. - Marcar tarefa como concluída");
            System.out.println("4. - Listar tarefas");
            System.out.println("5. - Sair");
            System.out.print("Escolha uma opção:  ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;
                case 2:
                    System.out.print("Índice da tarefa a remover: ");
                    int indiceRemover = scanner.nextInt();
                    gerenciador.removerTarefa(indiceRemover - 1);
                    break;
                case 3:
                    System.out.print("Índice da tarefa a marcar como concluída: ");
                    int indiceConcluir = scanner.nextInt();
                    gerenciador.marcarTaredaComoConcluida(indiceConcluir - 1);
                    break;
                case 4:
                    gerenciador.listarTarefas();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}