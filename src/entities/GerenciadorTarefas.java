package entities;

import java.util.ArrayList;
import java.util.List;

import enums.prioridade.Prioridade;

public class GerenciadorTarefas {

	private List<Tarefa> lista = new ArrayList<>();

	public void adicionarTarefa(String descricao, Prioridade prioridade) {
		Tarefa tarefa = new Tarefa(descricao, prioridade);
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
		boolean removida = lista.removeIf(t -> t.getId() == id);
		return removida;
	}

	public boolean marcarComoConcluida(int id) {

		for (Tarefa t : lista) {
			if (t.getId() == id) {
				t.marcarComoConcluida();
				return true;
			}
		}

		return false;
	}

	public void listarPrioridade() {

	    List<Tarefa> copia = new ArrayList<>(lista);

	    copia.sort((t1, t2) -> t2.getPrioridade().compareTo(t1.getPrioridade()));

	    for (Tarefa t : copia) {
	        System.out.println(t);
	    }
	}

}