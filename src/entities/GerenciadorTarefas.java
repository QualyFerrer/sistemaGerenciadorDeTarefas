package entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {

    private List<Tarefa> lista = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        lista.add(tarefa);
    }

    public void listarTarefas() {
        if (lista.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (Tarefa t : lista) {
                System.out.println(t);
            }
        }
    }
    public Tarefa buscarPorId(int id) {
        for (Tarefa t : lista) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public boolean removerTarefa(int id) {
        boolean removida = lista.removeIf
        		(t -> t.getId() == id);
		return removida;
        }

    public void marcarComoConcluida(int id) {
        boolean encontrada = false;

        for (Tarefa t : lista) {
            if (t.getId() == id) {
                t.marcarComoConcluida();
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Tarefa com ID " + id + " não encontrada.");
        }
    }
    
}