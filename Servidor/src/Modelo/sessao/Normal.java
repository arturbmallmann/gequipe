package Modelo.sessao;

import Modelo.Tarefa;

public class Normal extends SessaoAbstrata{
	public boolean AdicionarTarefa(Tarefa tarf,String projeto){
		return false;
	}
	public boolean AdicionarProjeto(String nome){
		return false;
	}
	public boolean AdicionarMembro(String login){
		return false;
	}
	public boolean RemoverMembro(String login){
		return false;
	}
	public boolean RemoverProjeto(String nome){
		return false;
	}

}
