package Modelo.sessao;

import Modelo.Equipe;
import Modelo.InfoArquivo;
import Modelo.InfoTarefa;
import Modelo.Tarefa;

public class Normal extends SessaoAbstrata{
	protected Equipe equipe;
	@Override
	public InfoArquivo VisualizarArquivo(String nome)throws Exception{
		return equipe.VisualizarArquivo(nome);
	}
	@Override
	public void ModificarArquivo (InfoArquivo info)throws Exception{
		equipe.ModificarArquivo(info);
	}
	@Override
	public void AtualizarTarefa(InfoTarefa info,String projeto, String tarefa)throws Exception{
		equipe.AtualizarTarefa(info, projeto, tarefa);
	}
	@Override
	public void Desconectar()throws Exception{
		equipe.Desconectar();
	}
}
