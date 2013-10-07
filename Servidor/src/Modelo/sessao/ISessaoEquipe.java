package Modelo.sessao;

import java.util.ArrayList;

import Controle.IBaseDeDados;
import Modelo.InfoArquivo;
import Modelo.InfoTarefa;
import Modelo.Usuario;

public interface ISessaoEquipe {
	public InfoArquivo VisualizarArquivo(String nome) throws Exception;
	public InfoTarefa VisualizarTarefa(String nome, String projeto) throws Exception;
	public ArrayList<String> ListarTarefas(String projeto) throws Exception;
	public ArrayList<String> ListarProjetos() throws Exception;
	public ArrayList<String> ListarArquivos() throws Exception;
	public void ModificarArquivo (String nome,InfoArquivo info)throws Exception;
	public void AtualizarTarefa(InfoTarefa info,String projeto)throws Exception;
	public void AdicionarTarefa(InfoTarefa info,String projeto)throws Exception;
	public void AdicionarProjeto(String nome)throws Exception;
	public void AdicionarMembro(Usuario usuario)throws Exception;
	public void RemoverMembro(String login)throws Exception;
	public void RemoverProjeto(String nome)throws Exception;
	public void ModificarNivel(Usuario usuario,Integer valor,IBaseDeDados dados)throws Exception;
}