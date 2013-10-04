package Modelo.sessao;

import Modelo.InfoArquivo;
import Modelo.InfoTarefa;
import Modelo.Tarefa;

public interface ISessaoEquipe {
	public InfoArquivo VisualizarArquivo(String nome) throws Exception;
	public void ModificarArquivo (InfoArquivo info)throws Exception;
	public void AtualizarTarefa(InfoTarefa info,String projeto, String tarefa)throws Exception;
	public void AdicionarTarefa(Tarefa tarf,String projeto)throws Exception;
	public void AdicionarProjeto(String nome)throws Exception;
	public void AdicionarMembro(String login)throws Exception;
	public void RemoverMembro(String login)throws Exception;
	public void RemoverProjeto(String nome)throws Exception;
	public void Desconectar()throws Exception;
}