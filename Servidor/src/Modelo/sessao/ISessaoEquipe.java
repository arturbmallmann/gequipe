package Modelo.sessao;

import Modelo.InfoArquivo;
import Modelo.InfoTarefa;
import Modelo.Tarefa;

public interface ISessaoEquipe {
	public InfoArquivo VisualizarArquivo(String nome);
	public boolean ModificarArquivo (InfoArquivo info);
	public boolean AtualizarTarefa(InfoTarefa info,String projeto, String tarefa);
	public boolean AdicionarTarefa(Tarefa tarf,String projeto);
	public boolean AdicionarProjeto(String nome);
	public boolean AdicionarMembro(String login);
	public boolean RemoverMembro(String login);
	public boolean RemoverProjeto(String nome);
	public boolean Desconectar();
}
