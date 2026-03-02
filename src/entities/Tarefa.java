package entities;

public class Tarefa {

    private static int contador = 0;

    private int id;
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.id = ++contador;
        this.descricao = descricao;
        this.concluida = false;
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
        String status = concluida ? "[CONCLUÍDA]" : "[PENDENTE]";
        return id + " - " + descricao + " " + status;
    }
}