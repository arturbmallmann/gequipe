package Modelo.sessao;

import java.util.ArrayList;

import Controle.IBaseDeDados;
import Modelo.*;

public abstract class SessaoAbstrata implements ISessaoEquipe{
	protected Equipe equipe;
	public SessaoAbstrata(Equipe equipe) {
		this.equipe=equipe;
	}
	public ArrayList<String> ListarTarefas(String projeto) throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public ArrayList<String> ListarProjetos() throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public ArrayList<String> ListarArquivos() throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public InfoArquivo VisualizarArquivo(String nome)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public InfoTarefa VisualizarTarefa(String nome, String projeto)throws Exception{
		throw new Exception("funcao nao implementada");
	}
	public void ModificarArquivo (String nome,InfoArquivo info)throws Exception{
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
	public void ModificarNivel(Usuario usuario,Integer valor,IBaseDeDados dados) throws Exception{
		throw new Exception("funcao nao implementada");
	}
}
