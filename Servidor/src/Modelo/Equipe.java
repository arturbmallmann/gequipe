package Modelo;

import java.util.ArrayList;

public class Equipe {
	ArrayList<Arquivo> arquivos;
	ArrayList<Projeto> projetos;
	ArrayList<Usuario> membros;

	public InfoArquivo VisualizarArquivo(String nome){
		
		return null;
	}
	public boolean ModificarArquivo (InfoArquivo info){
		return false;
	}
	public boolean AtualizarTarefa(InfoTarefa info,String projeto, String tarefa){}
	public boolean AdicionarTarefa(Tarefa tarf,String projeto){}
	public boolean AdicionarProjeto(String nome){}
	public boolean AdicionarMembro(String login){}
	public boolean RemoverMembro(String login){}
	public boolean RemoverProjeto(String nome){}
	public boolean Desconectar(){}
	
}
