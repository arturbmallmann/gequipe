package Modelo;

import java.util.ArrayList;

public class Equipe {
	ArrayList<Arquivo> arquivos;
	ArrayList<Projeto> projetos;
	ArrayList<Usuario> membros;

	public InfoArquivo VisualizarArquivo(String nome) {
		return null;
	}

	public boolean ModificarArquivo(InfoArquivo info) {
		arquivos.get(0).Modificar(info);
		return true;
	}

	public boolean AtualizarTarefa(InfoTarefa info, String projeto,
			String tarefa) {

		return false;
	}

	public boolean AdicionarTarefa(Tarefa tarf, String projeto) {

		return false;
	}

	public boolean AdicionarProjeto(String nome) {
		return false;
	}

	public boolean AdicionarMembro(String login) {
		return false;
	}

	public boolean RemoverMembro(String login) {
		return false;
	}

	public boolean RemoverProjeto(String nome) {
		return false;
	}

	public boolean Desconectar() {
		return false;
	}

}
