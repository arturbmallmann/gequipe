package Modelo.sessao;

import Modelo.*;

public abstract class SessaoAbstrata implements ISessaoEquipe{
	protected Equipe equipe;
	public InfoArquivo VisualizarArquivo(String nome)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void ModificarArquivo (InfoArquivo info)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void AtualizarTarefa(InfoTarefa info,String projeto, String tarefa)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void Desconectar()throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void AdicionarTarefa(Tarefa tarf,String projeto)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void AdicionarProjeto(String nome)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void AdicionarMembro(String login)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void RemoverMembro(String login)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void RemoverProjeto(String nome)throws Exception{
		throw new Exception("funcao nao implementada");
	}
}
