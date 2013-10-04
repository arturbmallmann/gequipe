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
	public void AtualizarTarefa(InfoTarefa info,String projeto)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void AdicionarTarefa(InfoTarefa tarf,String projeto)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void AdicionarProjeto(String nome)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void AdicionarMembro(Usuario usuario)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void RemoverMembro(String login)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void RemoverProjeto(String nome)throws Exception{
		throw new Exception("funcao nao implementada");
	}
}
