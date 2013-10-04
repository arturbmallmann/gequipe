package Modelo.sessao;

import Modelo.Equipe;
import Modelo.InfoArquivo;
import Modelo.InfoTarefa;
import Modelo.Tarefa;

public class Administrador extends SessaoAbstrata{
	public InfoArquivo VisualizarArquivo(String nome){
		 return equipe.VisualizarArquivo(nome);
	}
	@Override
	public void ModificarArquivo (InfoArquivo info){
		 equipe.ModificarArquivo(info);
	}
	@Override
	public void AtualizarTarefa(InfoTarefa info,String projeto, String tarefa){
		 equipe.AtualizarTarefa(info, projeto, tarefa);
	}
	@Override
	public void Desconectar(){
		 equipe.Desconectar();
	}
	@Override
	public void AdicionarTarefa(Tarefa tarf,String projeto){
		 equipe.AdicionarTarefa(tarf, projeto);
	}
	@Override
	public void AdicionarProjeto(String nome){
		 equipe.AdicionarProjeto(nome);
	}
	@Override
	public void AdicionarMembro(String login){
		 equipe.AdicionarMembro(login);
	}
	@Override
	public void RemoverMembro(String login){
		 equipe.RemoverMembro(login);
	}
	@Override
	public void RemoverProjeto(String nome){
		 equipe.RemoverMembro(nome);
	}
}
