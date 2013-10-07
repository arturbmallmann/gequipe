package Modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class Projeto {
	private String nome;

	ArrayList<String> chavesTarefas;
	private HashMap<String, Tarefa> tarefas;
	public Projeto() {
		chavesTarefas=new ArrayList<String>();
		tarefas=new HashMap<String, Tarefa>();
	}
	
	public ArrayList<String> listarTarefas(){
		return chavesTarefas;
	}
	public void adicionarTarefa(InfoTarefa info) throws Exception {
		if(!tarefas.containsKey(nome)){
			chavesTarefas.add(info.getTitulo());
			tarefas.put(info.getTitulo(), new Tarefa(info));
			}
		else
			throw new Exception("projeto já existe");
	}
	public void atualizarTarefa(InfoTarefa info, String titulo){
		Tarefa temp = tarefas.get(titulo);
		temp.atualizar(info);
	}
	public InfoTarefa visualizarTarefa(String titulo){
		Tarefa temp = tarefas.get(titulo);
		return temp.Visualizar();
	}
	public String getNome() {
		return nome;
	}
}
