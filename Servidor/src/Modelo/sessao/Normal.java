package Modelo.sessao;

import Modelo.Equipe;
import Modelo.InfoArquivo;
import Modelo.InfoTarefa;

public class Normal extends SessaoAbstrata{
	public Normal(Equipe equipe) {
		super(equipe);
	}
	@Override
	public InfoArquivo VisualizarArquivo(String nome)throws Exception{
		return equipe.VisualizarArquivo(nome);
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
