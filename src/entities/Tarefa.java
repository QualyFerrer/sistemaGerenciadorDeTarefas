package entities;

import enums.prioridade.Prioridade;

public class Tarefa {

    private static int contador = 0;

    private int id;
    private String descricao;
    private boolean concluida;
    private Prioridade prioridade;

    public Tarefa(String descricao, Prioridade prioridade) {
        this.id = ++contador;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }
    public Prioridade getPrioridade() {
    	return prioridade;
    }
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return id + " - " + descricao +
               " | Prioridade: " + prioridade +
               " | " + (concluida ? "[Concluída]" : "[Pendente]");
    }
}