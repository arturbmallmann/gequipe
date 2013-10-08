package Modelo;

public class Tarefa {
	private InfoTarefa info;
	public Tarefa(){
		super();
	}
	public Tarefa(InfoTarefa info) {
		super();
		this.info=info;
	}
	public void atualizar(InfoTarefa info){
		this.info=info;
	}
	public InfoTarefa Visualizar(){
		return this.info;
	}
}
