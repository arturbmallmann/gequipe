package Modelo.sessao;

import Modelo.InfoArquivo;
import Modelo.InfoTarefa;

public class Normal extends SessaoAbstrata{
	@Override
	public InfoArquivo VisualizarArquivo(String nome)throws Exception{
		return equipe.VisualizarArquivo(nome);
	}
	@Override
	public void ModificarArquivo (InfoArquivo info)throws Exception{
		equipe.ModificarArquivo(info);
	}
	@Override
	public void AtualizarTarefa(InfoTarefa info,String projeto)throws Exception{
		equipe.AtualizarTarefa(info, projeto);
	}
}
