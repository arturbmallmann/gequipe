package Modelo.sessao;

import Modelo.*;

public abstract class SessaoAbstrata implements ISessaoEquipe{
	protected Equipe equipe;
	public InfoArquivo VisualizarArquivo(String nome){
		return equipe.VisualizarArquivo(nome);
	}
	public boolean ModificarArquivo (InfoArquivo info){
		return equipe.ModificarArquivo(info);
	}
	public boolean AtualizarTarefa(InfoTarefa info,String projeto, String tarefa){
		return equipe.AtualizarTarefa(info, projeto, tarefa);
	}
	public boolean Desconectar(){
		return equipe.Desconectar();
	}

}
