package Modelo;

import java.util.HashMap;

public class Projeto {
	private String nome;
	private HashMap<String, Tarefa> tarefas;
	public void adicionarTarefa(InfoTarefa info) {
		tarefas.put(info.getTitulo(), new Tarefa(info));
	}
	public void atualizarTarefa(InfoTarefa info, String titulo){
		Tarefa temp = tarefas.get(titulo);
		temp.atualizar(info);
	}
	public String getNome() {
		return nome;
	}
}
