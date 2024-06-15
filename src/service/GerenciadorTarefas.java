package service;

import model.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(int indice) {
        if(indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void marcarTaredaComoConcluida(int indice) {
        if(indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).setConcluida(true);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }
}
