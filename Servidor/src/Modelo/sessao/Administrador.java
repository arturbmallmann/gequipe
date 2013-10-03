package Modelo.sessao;

import Modelo.Tarefa;

public class Administrador extends SessaoAbstrata{
	public boolean AdicionarTarefa(Tarefa tarf,String projeto){
		return equipe.AdicionarTarefa(tarf, projeto);
	}
	public boolean AdicionarProjeto(String nome){
		return equipe.AdicionarProjeto(nome);
	}
	public boolean AdicionarMembro(String login){
		return equipe.AdicionarMembro(login);
	}
	public boolean RemoverMembro(String login){
		return equipe.RemoverMembro(login);
	}
	public boolean RemoverProjeto(String nome){
		return equipe.RemoverMembro(nome);
	}
}
