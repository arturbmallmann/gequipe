package Controle;

import java.util.HashMap;
import Modelo.*;

public class Controle {
	
	private IBaseDeDados dados;
	private HashMap<String, Usuario> usuarios;
	private HashMap<String, Equipe> equipes;
	
	public Controle(){
		dados = new DadosGambiarrrra();
		usuarios = dados.listaDeUsuarios();
		equipes = dados.listaDeEquipes();
	}
	
	// \/ ignorem eh soh um esboço...
	public void adicionarProjeto(String nome){
		
	}
	public void removerProjeto(String nome){
		
	}
	public void criarTarefa(InfoTarefa info){
		
	}
	public void atualizarTarefa(Tarefa tarefa, InfoTarefa info){
		
	}
	public void adicionarMembro(String login){
		
	}
	public void removerMembro(String login){
		
	}
	public void modificarNivel(String nivel, String login){
		
	}
	public void efetuarLogin(String login, String senha){
		
	}
	public void desconectar(){
		
	}
	public void listarArquivos(){
		
	}
	public void vizualizarArquivo(String titulo){
		
	}
	public void modificarArquivo(InfoArquivo info){
		
	}

}
