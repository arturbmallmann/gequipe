package Modelo.sessao;

import java.util.ArrayList;

import Modelo.Equipe;
import Modelo.InfoArquivo;
import Modelo.InfoTarefa;

public class Normal extends SessaoAbstrata{
	public Normal(Equipe equipe) {
		super(equipe);
	}
	
	@Override
	public ArrayList<String> ListarTarefas(String projeto) throws Exception{
		return equipe.ListarTarefas(projeto);
	}
	@Override
	public ArrayList<String> ListarProjetos() throws Exception{
		return equipe.ListarProjetos();
	}
	@Override
	public ArrayList<String> ListarArquivos() throws Exception{
		return equipe.ListarArquivos();
	}
	@Override
	public InfoArquivo VisualizarArquivo(String nome)throws Exception{
		return equipe.VisualizarArquivo(nome);
	}
	@Override
	public InfoTarefa VisualizarTarefa(String nome, String projeto)throws Exception{
		return equipe.VisualizarTarefa(nome,projeto);
	}
	@Override
	public void ModificarArquivo (String nome,InfoArquivo info)throws Exception{
		equipe.ModificarArquivo(nome,info);
	}
	@Override
	public void AtualizarTarefa(InfoTarefa info,String projeto)throws Exception{
		equipe.AtualizarTarefa(info, projeto);
	}
}
